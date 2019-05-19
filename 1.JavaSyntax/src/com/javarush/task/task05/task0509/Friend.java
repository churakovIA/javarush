package com.javarush.task.task05.task0509;

/* 
Создать класс Friend
*/

public class Friend {
    String name;
    int age;
    char sex;

    public void initialize(String aName) {this.name = aName;}
    public void initialize(String aName, int aAge) {initialize(aName);this.age = aAge;}
    public void initialize(String aName, int aAge, char aSex) {initialize(aName, aAge);this.sex = aSex;}

    public static void main(String[] args) {

    }
}
