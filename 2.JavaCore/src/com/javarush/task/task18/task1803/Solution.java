package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String fname = in.readLine();

        Integer maxCount = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        FileInputStream stream = new FileInputStream(fname);
        while (stream.available() > 0){
            int data = stream.read();
            int value = map.containsKey(data) ? map.get(data)+1 : 1;
            map.put(data, value);
            if(value > maxCount) maxCount = value;
        }

        stream.close();
        in.close();

        Integer finalMaxCount = maxCount;
        map.forEach((k, v) -> {
            if(v == finalMaxCount) System.out.print(k + " ");
        });

    }
}
