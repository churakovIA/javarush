package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        //System.out.print("Введите число: ");
        int n = in.nextInt();
        if(n>0) n *= 2;
        else if(n<0) n++;
        else n = 0;
        System.out.println(n);
    }

}