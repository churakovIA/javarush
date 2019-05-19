package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int ch;
        if(a>0 && b>0) ch = 1;
        else if(a<0 && b>0) ch = 2;
        else if(a<0 && b<0) ch = 3;
        else ch = 4;
        System.out.println(ch);
    }
}
