package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        int id = Integer.parseInt(reader.readLine());
//        String name = reader.readLine();
//
//        System.out.println("Id=" + id + " Name=" + name);

        HashMap<String, Integer> map = new HashMap<>();
        while (true) {
            String str = reader.readLine();
            if(str.isEmpty()) break;
            int id = Integer.parseInt(str);
            String name = reader.readLine();

            map.put(name, id);

        }

        map.forEach((k, v) -> System.out.println(v + " " + k));

    }
}
