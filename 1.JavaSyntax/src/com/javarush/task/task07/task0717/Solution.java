package com.javarush.task.task07.task0717;

import java.util.ArrayList;
import java.util.Collections;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list = new ArrayList<>();
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // ввод BufferedReader
//        for(int i=0;i<10;i++) list.add(in.readLine()); // ввод строк в массив
        Collections.addAll(list, "мама","мыла","раму");

        ArrayList<String> result = doubleValues(list);

        // Вывести на экран result
        for(String s: list) System.out.println(s);
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for(int i = list.size(); i > 0; i--) list.add(i, list.get(i-1));
        return list;
    }
}
