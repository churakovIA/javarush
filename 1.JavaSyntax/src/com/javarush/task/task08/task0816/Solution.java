package com.javarush.task.task08.task0816;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        for (int i = 0; i < 9; i++){
            map.put("Name"+i, new Date(1985,i+1,1));
        }
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        map.entrySet().removeIf( (entry) -> Arrays.asList(5,6,7).contains(entry.getValue().getMonth()) );
    }

    public static void main(String[] args) {

    }
}
