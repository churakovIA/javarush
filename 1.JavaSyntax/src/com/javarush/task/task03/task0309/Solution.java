package com.javarush.task.task03.task0309;

/* 
Сумма 10 чисел
*/

public class Solution {
    public static void main(String[] args) {

        for(int i=0;i<10;i++) {
            int s = 0;
            for (int a = 0; a <= i; a++)
                s = s + (a+1);
//            System.out.println((i+1) + ": " + s);
            System.out.println(s);
        }
    }
}
