package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        result = multiply(s, 5);
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        while (result.length()<count*s.length()) result.concat(s);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiply("abc"));
    }
}
