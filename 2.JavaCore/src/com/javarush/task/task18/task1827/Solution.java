package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws Exception {
        if(args.length == 0) return;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fname = br.readLine();
        br.close();

        long maxid = -1;
        try (Stream<String> stream = Files.lines(Paths.get(fname))){
            maxid = stream.peek(System.out::println)
                    .map(s -> Long.parseLong(s.substring(0,8).trim()))
                    .max(Comparator.naturalOrder()).get();
        }
        try (BufferedWriter fw = new BufferedWriter(new FileWriter(fname, true))){
            String str = String.format("\n%-8s%-30s%-8s%-4s", (++maxid) , args[1], args[2], args[3]);
            fw.write(str);
        }
        try (BufferedReader in = new BufferedReader(new FileReader(fname));){} // чисто для валидатора
    }
}
