package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        double usd1 = convertEurToUsd(10, 67.78);
        double usd2 = convertEurToUsd(24, 67.78);
        System.out.println(usd1);
        System.out.println(usd2);
    }

    public static double convertEurToUsd(int eur, double course) {
        double usd = eur * course;
        return usd;
    }
}
