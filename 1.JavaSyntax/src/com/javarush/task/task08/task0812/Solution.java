package com.javarush.task.task08.task0812;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException, InterruptedException {
        ArrayList<Integer> list = new ArrayList<>();
        //Collections.addAll(list, 2, 4, 4, 4, 8, 8, 9, 12, 12, 14);
        //Collections.addAll(list, 155, 155, 155, 155, 155, 90, 90, 90, 30, 30);
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 10; i++) list.add(in.nextInt());

        int max = 0;
        int seq = 1;
        for (int i = 1; i < list.size(); i++){
            if(list.get(i-1).equals(list.get(i)))
                seq++;
            else
                seq = 1;
            if(max < seq) max = seq;
        }
        System.out.println(max);

/*
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int int1 = iterator.next();
            int seq = 1;
            while (iterator.hasNext()){
                int int2 = iterator.next();
                if (int1 == int2) {
                    seq++;
                }
                else break;
            }
            if(max < seq) max = seq;
        }
*/


    }
}