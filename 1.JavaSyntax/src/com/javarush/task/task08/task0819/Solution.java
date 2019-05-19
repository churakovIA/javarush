package com.javarush.task.task08.task0819;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        for (Cat cat : cats) {
            cats.remove(cat);
            break;
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2

        return new HashSet<Cat>(Arrays.asList(new Cat(), new Cat(), new Cat()));
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        cats.forEach(cat -> System.out.println(cat));
    }

    // step 1 - пункт 1
    static class Cat {}
}
