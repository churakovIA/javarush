package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        double t = in.nextDouble();
        view(t);
    }

    private static void view(double t) {
        if (t%5>=0 && t%5<3) System.out.println("зелёный");
        else if (t%5>=3 && t%5<4) System.out.println("жёлтый");
        else System.out.println("красный");

    }
}