package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[] ints = new int[10];
        for(int i=0;i<ints.length;i++) ints[i] = Integer.parseInt(in.readLine());
        //int[] ints = {2,4,8,5,6,1,0,9,3,11};
        //Arrays.parallelSort(ints);
        for(int i=ints.length-1;i>=0;i--) System.out.println(ints[i]);


    }
}

