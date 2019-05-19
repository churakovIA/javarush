package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //два дедушки, две бабушки, отец, мать, трое детей

        ArrayList<Human> children = new ArrayList<>(Arrays.asList(new Human(), new Human(), new Human()));
        ArrayList<Human> mother = new ArrayList<>(Arrays.asList(new Human(children)));
        ArrayList<Human> father = new ArrayList<>(Arrays.asList(new Human(children)));
        ArrayList<Human> grandMother = new ArrayList<>(Arrays.asList(new Human(mother), new Human(father)));
        ArrayList<Human> grandFather = new ArrayList<>(Arrays.asList(new Human(mother), new Human(father)));

        ArrayList<Human> all = new ArrayList<>();
        all.addAll(children);
        all.addAll(mother);
        all.addAll(father);
        all.addAll(grandMother);
        all.addAll(grandFather);

        for(Human h : all) System.out.println(h);


/*
        Human mother = new Human(children);
        Human father = new Human(children);
        Human grandFather1 = new Human(mother);
        Human grandMother1 = new Human(mother);
        Human grandFather2 = new Human(father);
        Human grandMother2 = new Human(father);

        System.out.println(grandMother2);
*/

/*
        Human ch1 = new Human();
        Human ch2 = new Human();
        Human ch3 = new Human();

        Human mother = new Human();
        mother.children.add(ch1);
        mother.children.add(ch2);
        mother.children.add(ch3);
        Human father = new Human();
        father.children.add(ch1);
        father.children.add(ch2);
        father.children.add(ch3);

        Human grandFather1 = new Human();
        grandFather1.children.add(mother);

        Human grandMother1 = new Human();
        grandMother1.children.add(mother);

        Human grandFather2 = new Human();
        grandFather2.children.add(father);

        Human grandMother2 = new Human();
        grandMother2.children.add(father);

        System.out.println(grandMother2);
*/


    }

    public static class Human {
        //напишите тут ваш код
        String name;
        Boolean sex;
        int age;
        ArrayList<Human> children;

        Human() {
            this.name = "a";
            this.sex = true;
            this.age = 100;
            this.children = new ArrayList<>();
        }

        Human(ArrayList<Human> children) {
            this.name = "a";
            this.sex = true;
            this.age = 100;
            this.children = children;
        }

        Human(Human child) {
            this.name = "a";
            this.sex = true;
            this.age = 100;
            this.children = new ArrayList<>(Arrays.asList(child));
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
