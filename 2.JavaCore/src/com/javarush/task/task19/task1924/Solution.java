package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fname = br.readLine();
//        String fname = "E:\\trash\\java\\source.txt";
        br.close();

        try (Scanner in = new Scanner(new FileReader(fname))){
            while (in.hasNextLine()){
                System.out.println(
                        Stream.of(in.nextLine().split(" "))
                                .map(s -> {
                                            if (s.matches("[0-9]+") && map.containsKey(Integer.parseInt(s)))
                                                return map.get(Integer.parseInt(s));
                                            else return s;
                                        }
                                )
                                .collect(Collectors.joining(" "))
                );
            }
        }

    }
}
