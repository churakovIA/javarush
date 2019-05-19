package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    int top, left, width, height;

    public Rectangle(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public Rectangle(Rectangle r){
        this.top = r.top;
        this.left = r.left;
        this.width = r.width;
        this.height = r.height;
    }
    public Rectangle(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }
    public Rectangle(int top, int left){
        this.top = top;
        this.left = left;
    }

    public static void main(String[] args) {

    }
}
