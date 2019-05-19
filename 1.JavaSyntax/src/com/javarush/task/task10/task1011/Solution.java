package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        //напишите тут ваш код
        for (int i = Math.min(40, s.length()); i > 0; i--)
            System.out.println(s.substring(40-i));
    }

}

