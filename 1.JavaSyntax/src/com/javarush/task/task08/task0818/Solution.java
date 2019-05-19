package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("арбуз", 100);
        map.put("банан", 100);
        map.put("вишня", 700);
        map.put("груша", 100);
        map.put("дыня", 100);
        map.put("ежевика", 100);
        map.put("жень-шень", 500);
        map.put("земляника", 700);
        map.put("ирис", 900);
        map.put("картофель", 100);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //map.entrySet().removeIf((enty) -> enty.getValue() < 500);
        HashMap<String, Integer> temp = new HashMap<>(map);
        for(Map.Entry<String, Integer> entry: temp.entrySet())
            if(entry.getValue() < 500) map.remove(entry.getKey());
    }

    public static void main(String[] args) {
        //new TreeSet<Integer>(createMap().values()).forEach(integer -> System.out.println(integer));
//        HashMap<String, Integer> map = createMap();
//        removeItemFromMap(map);
//        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}