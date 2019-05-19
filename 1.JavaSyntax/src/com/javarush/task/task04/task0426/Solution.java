package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        boolean neg = a<0;
        boolean even = a%2 == 0;
        System.out.println(a==0?"ноль":
                String.format("%s %s число",a<0?"отрицательное":"положительное", a%2 == 0?"четное":"нечетное")
        );
    }
}
