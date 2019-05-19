package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String fname = in.readLine();
        new HashSet<Integer>().stream();
        HashSet<Integer> integers = new HashSet<Integer>();
        FileInputStream fileInputStream = new FileInputStream(fname);
        while (fileInputStream.available()>0) integers.add(fileInputStream.read());
        integers.stream().sorted().forEach(s-> System.out.print(s + " "));
        fileInputStream.close();
        in.close();

    }
}
