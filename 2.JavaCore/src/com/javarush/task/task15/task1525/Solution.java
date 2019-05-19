package com.javarush.task.task15.task1525;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static {
        try {
            String contents = new String(Files.readAllBytes(Paths.get(Statics.FILE_NAME)));
            List<String> words = Arrays.asList(contents.split("\\PL+"));
            long count = words.stream().filter(w -> w.contains("20160801")).count();
        } catch (IOException e) {
        }
    }

    public static void main(String[] args) {

        System.out.println(lines);
    }
}
