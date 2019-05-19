package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        String res;
        if(month>8 && month<12) res = "осень";
        else if(month>2 && month<6) res = "весна";
        else if(month>5 && month<9) res = "лето";
        else res = "зима";
        System.out.println(res);
    }
}