package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //System.out.println(mult(10));
        int i = 5;

        System.out.println(i);
    }
    public static final int mult(int q){
        int res = 1;
        for(int i=1;i<=q;i++) res = res * i;
        return res;
    }
}
