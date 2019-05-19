package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();

        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                list.add(Integer.parseInt(in.readLine()));
            }
        } catch (Exception e) {
            list.forEach((a) -> System.out.println(a));
        }
    }
}
