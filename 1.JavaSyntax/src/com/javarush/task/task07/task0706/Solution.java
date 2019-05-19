package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] ints = new int[15];

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // ввод BufferedReader
        for(int i=0;i<ints.length;i++) ints[i] = Integer.parseInt(in.readLine()); // ввод целых чисел в массив

        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 1;i<ints.length;i+=2) {
            sumOdd += ints[i];
            sumEven += ints[i-1];
        }

        System.out.println(sumEven>sumOdd?"В домах с четными номерами проживает больше жителей.":"В домах с нечетными номерами проживает больше жителей.");

    }
}
