package com.javarush.task.task01.task0131;

/* 
Полнометражная картина
*/

public class Solution {
    public static void main(String[] args) {
        //System.out.println(getMetreFromCentimetre(243));
        System.out.println(243*0.01);
    }

    public static int getMetreFromCentimetre(int centimetre) {
        //return centimetre*0.01;
        return (int)centimetre/100;
    }
}