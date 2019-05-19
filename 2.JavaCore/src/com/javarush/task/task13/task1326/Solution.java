package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException{
        // напишите тут ваш код
        String path = "E:\\test.txt";
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
        while (in.ready()) {
            String str = in.readLine();
            System.out.println(str);
        }
        in.close();
    }
}
//E:\test.txt