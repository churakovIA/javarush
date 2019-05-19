package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        if (y%400!=0 && y%100==0) System.out.println("количество дней в году: 365");
        else if (y%4 == 0 || y%100==0) System.out.println("количество дней в году: 366");
        else System.out.println("количество дней в году: 365");
        //for(int i = 2000;i<2020;i++) System.out.println(""+i+": "+i%4);
    }
}