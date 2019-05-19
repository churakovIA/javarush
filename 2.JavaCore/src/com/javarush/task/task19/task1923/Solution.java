package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        String infile = args[0];
        String outfile = args[1];

        try (Scanner in = new Scanner(new FileReader(infile));
             FileWriter out = new FileWriter(outfile)){
            while (in.hasNext()){
                String str = in.next();
                if(str.matches(".*[0-9].*")) out.write(str + " ");
            }
        }
    }
}
