package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {

        Human h1 = new Human("h1", true, 1);
        Human h2 = new Human("h2", true, 1);
        Human h3 = new Human("h3", true, 1);
        Human h4 = new Human("h4", true, 1);
        Human n1 = new Human("n1", true, 1, h1, h2);
        Human n2 = new Human("n2", true, 1, h1, h3);
        Human n3 = new Human("n3", true, 1, h1, h4);
        Human n4 = new Human("n4", true, 1, h2, h1);
        Human n5 = new Human("n5", true, 1, h2, h3);

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(h4);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);

    }

    public static class Human {
        //напишите тут ваш код имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















