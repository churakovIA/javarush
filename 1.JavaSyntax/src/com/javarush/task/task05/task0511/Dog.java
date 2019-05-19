package com.javarush.task.task05.task0511;

/* 
Создать класс Dog
*/

public class Dog {
    String name, color;
    int height;

    public void initialize(String name) {this.name = name;}
    public void initialize(String name, int height) {initialize(name);this.height = height;}
    public void initialize(String name, int height, String color) {initialize(name,height);this.color = color;}


    public static void main(String[] args) {

    }
}
