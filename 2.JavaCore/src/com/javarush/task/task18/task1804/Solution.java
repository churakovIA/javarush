package com.javarush.task.task18.task1804;

import java.util.HashMap;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        Integer value = map.merge("a", 1, Integer::sum);
        Integer value2 = map.merge("b", 1, Integer::sum);
        map.forEach((k, v) -> System.out.println("["+k + ":" + v+"]"));


    }
}
