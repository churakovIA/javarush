package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        if(a.equals(b)) System.out.println("Имена идентичны");
        else if(a.length() == b.length()) System.out.println("Длины имен равны");

    }
}
