package com.javarush.task.task31.task3113;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Что внутри папки?
*/
public class Solution {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //String str = "E:\\Short-term storage";

        Path path = Paths.get(str);
        if(!Files.isDirectory(path)){
            System.out.println(String.format("%s - не папка", str));
            return;
        }

        int dirCounter = -1;
        int fileCounter = 0;
        int size = 0;
        ArrayList<Path> list = new ArrayList<>();
        Files.walk(path).forEach(list::add);
        for(Path p : list){
            if(Files.isDirectory(p)) dirCounter++;
            else {
                fileCounter++;
                size += Files.size(p);
            }
        }

        System.out.println(String.format("Всего папок - %s\n" +
                "Всего файлов - %s\n" +
                "Общий размер - %s\n", dirCounter, fileCounter, size));

/*
        ArrayDeque<Path> deque = new ArrayDeque<>();
        deque.add(path);
        while(!deque.isEmpty()){
            path = deque.remove();
            Files.list(path)
        }
*/

    }
}
