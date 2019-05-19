package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String firstName;
        private String secondName;
        private int age;
        private boolean sex;
        private int size;
        private int power;

        public Human() {
            this.firstName = "Human1";
            this.secondName = "";
            this.age = 0;
            this.sex = true;
            this.size = 0;
            this.power = 0;
        }

        public Human(String n) {this.firstName = n;}

        public Human(String n, String fN) {
            this.firstName = n;
            this.secondName = fN;
            this.age = 0;
            this.sex = true;
            this.size = 0;
            this.power = 0;
        }

        public Human(String n, String fN, int age) {
            this.firstName = n;
            this.secondName = fN;
            this.age = age;
            this.sex = true;
            this.size = 0;
            this.power = 0;
        }

        public Human(String firstName, String secondName, int age, boolean sex, int size, int power) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.sex = sex;
            this.size = size;
            this.power = power;
        }

        public Human(String firstName, String secondName, int age, boolean sex, int size) {
            this(firstName, secondName, age, sex, size, 0);
        }

        public Human(String firstName, String secondName, int age, boolean sex) {
            this(firstName, secondName, age, sex, 0, 0);
        }

        public Human(boolean sex) {
            this("ccc", "", 0, sex, 0, 0);
        }

        public Human(int age, boolean sex) {
            this("ccc", "", age, sex, 0, 0);
        }

        public Human(int power) {
            this("ccc", "", 0, false, 0, power);
        }

    }
}
