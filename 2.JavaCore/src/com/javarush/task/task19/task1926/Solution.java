package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fname = br.readLine();
//        String fname = "E:\\trash\\java\\source.txt";
        br.close();

        try (Scanner in = new Scanner(new FileReader(fname))){
            while (in.hasNextLine()){
                StringBuilder stringBuilder = new StringBuilder(in.nextLine());
                stringBuilder.reverse();
                System.out.println(stringBuilder);
            }
        }


    }
}
