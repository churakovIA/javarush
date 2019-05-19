package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException{
        TreeMap<String, Double> map = new TreeMap<>();
        try (Scanner scanner = new Scanner(new FileReader(args[0]));) {
            while (scanner.hasNext())
                map.merge(scanner.next(), Double.parseDouble(scanner.next()), Double::sum);
        }
        map.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
