package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(in.readLine());
        int b = Integer.parseInt(in.readLine());
        int c = Integer.parseInt(in.readLine());

        System.out.println(a+b>c && a+c>b && b+c>a ? "Треугольник существует." : "Треугольник не существует.");

//        if (a+b > c) System.out.println("Треугольник не существует.");
//        else System.out.println("Треугольник существует.");
//        if (a+c > b) System.out.println("Треугольник не существует.");
//        else System.out.println("Треугольник существует.");
//        if (c+b > a) System.out.println("Треугольник не существует.");
//        else System.out.println("Треугольник существует.");

/*
        if ( (a > (b+c)) || (b > (a+c)) || (c > (a+b)) ) {
            System.out.println("Треугольник не существует.");
        }

        else {
            System.out.println("Треугольник существует.");
        }
*/


    }
}