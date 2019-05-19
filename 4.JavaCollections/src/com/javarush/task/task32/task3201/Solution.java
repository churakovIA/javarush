package com.javarush.task.task32.task3201;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
Запись в существующий файл
*/
public class Solution {
    public static void main(String... args) {
        try(RandomAccessFile r = new RandomAccessFile(args[0], "rw")){
            long pos = Integer.parseInt(args[1]);
            if(pos>r.length()) pos = r.length();
            r.seek(pos);
            r.write(args[2].getBytes());
        } catch (IOException e){

        }


    }
}
