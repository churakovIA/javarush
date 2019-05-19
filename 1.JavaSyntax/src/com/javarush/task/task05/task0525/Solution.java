package com.javarush.task.task05.task0525;

/* 
И целой утки мало
*/

public class Solution {

    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);
        Cat Cat1 = new Cat();
        Cat Cat2 = new Cat();
        System.out.println(Cat1);
        System.out.println(Cat2);
        Dog Dog1 = new Dog();
        Dog Dog2 = new Dog();
        System.out.println(Dog1);
        System.out.println(Dog2);

        //напишите тут ваш код
    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }
    public static class Cat {
        public String toString() {
            return "Cat";
        }
    }
    public static class Dog {
        public String toString() {
            return "Dog";
        }
    }

    //напишите тут ваш код
}
