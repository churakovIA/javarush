package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException{

//        String f1 = "E:\\trash\\java\\source.txt";

        TreeMap<String, Double> map = new TreeMap<>();
        try (Scanner scanner = new Scanner(new FileReader(args[0]));) {
//        try (Scanner scanner = new Scanner(new FileReader(f1));) {
            while (scanner.hasNext())
                map.merge(scanner.next(), Double.parseDouble(scanner.next()), Double::sum);
        }
        double max = Collections.max(map.values());
        map.forEach((k, v) -> {
            if(v == max) System.out.println(k);
        });

    }
}
