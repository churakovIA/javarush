package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int n = in.nextInt();
        int i = 0;
        while (i++ < n) System.out.println(str);
    }
}
