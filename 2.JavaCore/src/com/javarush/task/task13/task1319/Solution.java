package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new FileWriter(in.readLine()));
        String str;
        do {
            str = in.readLine();
            out.write(str + "\n");
            out.flush();
        } while (!str.equals("exit"));

//        while (!"exit".equals(str = in.readLine()))
//            out.write(str);
        in.close();
        out.close();
    }
}
