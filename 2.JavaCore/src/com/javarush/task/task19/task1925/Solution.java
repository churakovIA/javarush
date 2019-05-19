package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws IOException {

//        String infile = "E:\\trash\\java\\source.txt";
//        String outfile = "E:\\trash\\java\\destination.txt";
        String infile = args[0];
        String outfile = args[1];

        try (Scanner in = new Scanner(new FileReader(infile));
             Stream<String> lines = Files.lines(Paths.get(infile), StandardCharsets.UTF_8);
             FileWriter out = new FileWriter(outfile)
        ){
            List<String> list =
                lines.flatMap(s -> Stream.of(s.split(" ")))
                    .filter(w -> w.length() > 6).collect(Collectors.toList());
            out.write("".join(",", list));
        }
    }
}
