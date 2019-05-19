package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* 
Находим все файлы
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        List<String> list = new ArrayList<>();
        ArrayDeque<File> deque = new ArrayDeque<>();

        deque.add(new File(root));
        while(!deque.isEmpty()){
            File folder = deque.remove();
            for (File f : folder.listFiles()) {
                if (f.isFile())
                    list.add(f.getAbsolutePath());
                else
                    deque.add(f);
            }
        }

/*
        File folder = new File(root);
        while (true) {
            for (File f : folder.listFiles()) {
                if (f.isFile())
                    list.add(f.getAbsolutePath());
                else
                    deque.add(f);
            }
            if(deque.isEmpty())
                break;
            else
                folder = deque.remove();
        }
*/

        return list;
    }

    public static void main(String[] args) {
        try {
            List<String> list = getFileTree("E:/Short-term storage");
            list.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
