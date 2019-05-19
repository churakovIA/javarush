package com.javarush.task.task35.task3513;

import java.util.*;

public class Model {

    private static final int FIELD_WIDTH = 4;
    private Tile[][] gameTiles;
    int score;
    int maxTile;
    private Stack<Integer> previousScores;
    private Stack<Tile[][]> previousStates;
    private boolean isSaveNeeded = true;

    public Model() {
        resetGameTiles();
        this.score = 0;
        this.maxTile = 0;
        previousScores = new Stack<>();
        previousStates = new Stack<>();
    }

    public void resetGameTiles(){

        gameTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];
        for (int i = 0; i < gameTiles.length; i++) {
            for (int j = 0; j < gameTiles[0].length; j++) {
                gameTiles[i][j] = new Tile();
            }
        }
        addTile();
        addTile();
    }

    private List<Tile> getEmptyTiles(){
        List<Tile> tiles = new ArrayList<>();
        for (int i = 0; i < gameTiles.length; i++) {
            for (int j = 0; j < gameTiles[0].length; j++) {
                if(gameTiles[i][j].isEmpty()) tiles.add(gameTiles[i][j]);
            }
        }
        return tiles;
    }

    public void addTile(){
        List<Tile> emptyTiles = getEmptyTiles();
        if(emptyTiles.size()>0) {
            Tile tile = emptyTiles.get((int) (emptyTiles.size() * Math.random()));
            tile.value = (Math.random() < 0.9 ? 2 : 4);
        }
    }

    private boolean compressTiles(Tile[] tiles){
        boolean isModified = false;
        Tile temp;
        for (int i = 0; i < tiles.length-1; i++) {
            for (int j = 0; j < tiles.length-1; j++) {
                if (tiles[j].value == 0 && tiles[j + 1].value != 0) {
                    temp = tiles[j];
                    tiles[j] = tiles[j + 1];
                    tiles[j + 1] = temp;
                    isModified = true;
                }
            }
        }
        return isModified;
    }

    private boolean mergeTiles(Tile[] tiles){
        boolean isModified = false;
        for (int i = 0; i < tiles.length - 1; i++) {
            if(tiles[i].value!=0 && tiles[i].value == tiles[i+1].value){

                tiles[i].value*=2;
                tiles[i+1].value = 0;
                score = score + tiles[i].value;
                if(maxTile<tiles[i].value) maxTile = tiles[i].value;

                isModified = true;

            }
        }
        if(isModified)
            compressTiles(tiles);

        return isModified;
    }

    public void left(){
        if(isSaveNeeded){
            saveState(this.gameTiles);
        }
        boolean isModified = false;
        for (int i = 0; i < gameTiles.length; i++) {

            if(compressTiles(gameTiles[i]) | mergeTiles(gameTiles[i]))
                isModified = true;

        }

        if(isModified) {
            addTile();
            isSaveNeeded = true;
        }
    }

    public void up() {
        saveState(this.gameTiles);
        rotate();
        left();
        rotate();
        rotate();
        rotate();
    }

    public void right() {
        saveState(this.gameTiles);
        rotate();
        rotate();
        left();
        rotate();
        rotate();
    }

    public void down() {
        saveState(this.gameTiles);
        rotate();
        rotate();
        rotate();
        left();
        rotate();
    }

    // поворот матрицы на 90 градусов против часовой стрелки
    private void rotate() {
        int len = FIELD_WIDTH;
        for (int k = 0; k < len / 2; k++) // border -> center
        {
            for (int j = k; j < len - 1 - k; j++) // left -> right
            {

                Tile tmp = gameTiles[k][j];
                gameTiles[k][j] = gameTiles[j][len - 1 - k];
                gameTiles[j][len - 1 - k] = gameTiles[len - 1 - k][len - 1 - j];
                gameTiles[len - 1 - k][len - 1 - j] = gameTiles[len - 1 - j][k];
                gameTiles[len - 1 - j][k] = tmp;
            }
        }
    }

    public Tile[][] getGameTiles() {
        return gameTiles;
    }

    public boolean canMove(){
        if (!getEmptyTiles().isEmpty())
            return true;
        for (int i = 0; i < gameTiles.length; i++) {
            for (int j = 1; j < gameTiles.length; j++) {
                if (gameTiles[i][j].value == gameTiles[i][j - 1].value)
                    return true;
            }
        }
        for (int j = 0; j < gameTiles.length; j++) {
            for (int i = 1; i < gameTiles.length; i++) {
                if (gameTiles[i][j].value == gameTiles[i - 1][j].value)
                    return true;
            }
        }
        return false;
    }

    //--

    private void saveState(Tile[][] tiles){
        Tile[][] fieldToSave = new Tile[tiles.length][tiles[0].length];
        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles[0].length; j++) {
                fieldToSave[i][j] = new Tile(tiles[i][j].value);
            }
        }
        previousStates.push(fieldToSave);
        int scoreToSave = score;
        previousScores.push(scoreToSave);
        isSaveNeeded = false;
    }

    public void rollback(){
        if(!previousScores.isEmpty()){
            score = previousScores.pop();
        }
        if(!previousStates.isEmpty()){
            gameTiles = previousStates.pop();
        }
    }

    public void randomMove(){
        int n = ((int) (Math.random() * 100)) % 4;
        switch (n){
            case 0: left(); break;
            case 1: up(); break;
            case 2: right(); break;
            case 3: down(); break;
        }
    }

    public boolean hasBoardChanged(){
        return calcTotal(gameTiles) != calcTotal(previousStates.peek());
    }

    public static int calcTotal(Tile[][] tiles){
        int total = 0;
        for (int i = 0; i < tiles.length; i++) {
            for (int i1 = 0; i1 < tiles[0].length; i1++) {
                total+=tiles[i][i1].value;
            }
        }
        return total;
    }

    public MoveEfficiency getMoveEfficiency(Move move){
        move.move();
        boolean hasBoardChanged = hasBoardChanged();
        int numberOfEmptyTiles = hasBoardChanged ? getEmptyTiles().size() : -1;
        int score = hasBoardChanged ? this.score : 0;
        MoveEfficiency moveEfficiency = new MoveEfficiency(numberOfEmptyTiles, score, move);
        rollback();
        return moveEfficiency;
    }

    public void autoMove(){
        PriorityQueue<MoveEfficiency> queue = new PriorityQueue<>(FIELD_WIDTH, Collections.reverseOrder());
        queue.add(getMoveEfficiency(this::left));
        queue.add(getMoveEfficiency(this::up));
        queue.add(getMoveEfficiency(this::right));
        queue.add(getMoveEfficiency(this::down));
        queue.peek().getMove().move();
    }

}
