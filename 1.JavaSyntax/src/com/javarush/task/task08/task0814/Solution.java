package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Random;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> set = new HashSet<>();

        java.util.Random generator = new Random();
        for(int i = 0; i < 20; i++) set.add(generator.nextInt(100));

        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        set.removeIf(p -> p > 10);
        return set;
    }

    public static void main(String[] args) {
        HashSet<Integer> set = createSet();
        System.out.println(set);
        removeAllNumbersMoreThan10(set);
        System.out.println(set);
    }
}
