package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("cat1", 1, 1, 1),
                new Cat("cat2", 2, 2, 2),
                new Cat("cat3", 3, 3, 3)
        };
        System.out.println(cats[0].fight(cats[1]));
        System.out.println(cats[0].fight(cats[2]));
        System.out.println(cats[1].fight(cats[2]));
//        for(Cat cat1: cats)
//            for(Cat cat2: cats)
//                if(!cat1.equals(cat2)) System.out.println(cat1.name + " vs " + cat2.name + ": " +cat1.fight(cat2));
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
