package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name, address, color;
    int weight, age;

    public void initialize(String name) {
        this.name = name;
        this.color = "red";
        this.age = 1;
        this.weight = 1;
    }
    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.color = "red";
        this.age = age;
        this.weight = weight;
    }
    public void initialize(String name, int age) {
        this.name = name;
        this.color = "red";
        this.age = age;
        this.weight = 1;
    }
    public void initialize(int weight, String color) {
        this.color = color;
        this.age = 1;
        this.weight = weight;
    }
    public void initialize(int weight, String color, String address) {
        this.color = color;
        this.age = 1;
        this.weight = weight;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
