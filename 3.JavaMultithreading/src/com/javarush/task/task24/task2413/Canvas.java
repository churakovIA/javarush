package com.javarush.task.task24.task2413;

public class Canvas {
    private int width;
    private int height;
    private char[][] matrix;

    public Canvas(int widht, int height) {
        this.width = widht;
        this.height = height;
        this.matrix = new char[height+2][widht+2];
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int widht) {
        this.width = widht;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public char[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(char[][] matrix) {
        this.matrix = matrix;
    }
}
