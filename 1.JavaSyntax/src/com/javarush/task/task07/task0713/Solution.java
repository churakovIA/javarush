package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<20;i++) mainList.add(Integer.parseInt(in.readLine()));

        for(int nextInt: mainList) {
            if(nextInt%3 == 0) list1.add(nextInt);
            if(nextInt%2 == 0) list2.add(nextInt);
            if(nextInt%3 != 0 && nextInt%2 != 0) list3.add(nextInt);
        }

        printList(mainList);
        printList(list1);
        printList(list2);
        printList(list3);

    }

    public static void printList(List<Integer> list) {
        for(Integer next: list) System.out.println(next);
    }
}
