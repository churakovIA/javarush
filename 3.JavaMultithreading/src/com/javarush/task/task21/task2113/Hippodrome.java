package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    private List<Horse> horses;
    public static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) throws InterruptedException {

        Horse hA = new Horse("A",3,0);
        Horse hB = new Horse("B",3,0);
        Horse hC = new Horse("C",3,0);

        game = new Hippodrome(new ArrayList<>());

        List<Horse> l = game.getHorses();

        l.add(hA);
        l.add(hB);
        l.add(hC);
        try{
        game.run();
        } catch(Exception e){
            
        }
        game.printWinner();

    }

    public void run() throws InterruptedException {
        for(int i = 0; i<100; i++){
            move();
            print();
            Thread.sleep(200);
        }
    }
    public void move(){
        horses.forEach(Horse::move);
    }
    public void print(){
        horses.forEach(Horse::print);
        for(int i = 0; i<10; i++) System.out.println();
    }

    public Horse getWinner(){
        double maxdist = 0;
//        Horse winner = null;
        Horse winner = new Horse("",0,0);
        for(Horse horse:horses){
            if(horse.getDistance()>maxdist){
                maxdist = horse.getDistance();
                winner = horse;
            }
        }
        return winner;
    }
    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

}
