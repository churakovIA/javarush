package com.javarush.task.task15.task1517;

/* 
Статики и исключения
*/

public class Solution{
    public static int A = 0;

    static {
        //throw an exception here - выбросьте эксепшн тут
        A = A /0;
//        try {
//            throw new Exception();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
