package com.javarush.task.task07.task0715;

import java.util.ArrayList;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        //list.addAll(Arrays.asList("мама","мыла","раму"));
        Collections.addAll(list, "мама","мыла","раму");
        for(int i=2;i>=0;i--) list.add(i+1, "именно");
        for(String s: list) System.out.println(s);
    }
}
