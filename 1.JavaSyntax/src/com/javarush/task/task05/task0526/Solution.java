package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("",1,"");
        Man man2 = new Man("",1,"");
        Woman woman1 = new Woman("",1,"");
        Woman woman2 = new Woman("",1,"");
        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
    }

    public static class Man {
        String name, address;
        int age;
        public Man(String name, int age, String address){
            this.name = name;
            this.address = address;
            this.age = age;
        }
        public String toString() {
            return name + " " + age + " " + address;
        }
    }
    public static class Woman {
        String name, address;
        int age;
        public Woman(String name, int age, String address){
            this.name = name;
            this.address = address;
            this.age = age;
        }
        public String toString() {
            return name + " " + age + " " + address;
        }
    }
}
