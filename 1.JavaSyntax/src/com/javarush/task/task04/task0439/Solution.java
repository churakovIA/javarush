package com.javarush.task.task04.task0439;

/* 
Письмо счастья
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        for(int i=0;i<10;i++) System.out.println(name + " любит меня.");
    }
}
