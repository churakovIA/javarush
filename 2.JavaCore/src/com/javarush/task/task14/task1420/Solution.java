package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int a = Integer.parseUnsignedInt(in.nextLine());
        int b = Integer.parseUnsignedInt(in.nextLine());
        if (a<=0 || b<=0) throw new Exception();

        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        System.out.println(a);
    }
}
