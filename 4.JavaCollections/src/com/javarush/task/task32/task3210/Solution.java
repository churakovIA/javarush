package com.javarush.task.task32.task3210;

import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) throws IOException {
        try (RandomAccessFile r = new RandomAccessFile(args[0], "rw")){
            long pos = Long.parseLong(args[1]);

            byte[] buffer = new byte[args[2].length()];
            r.seek(pos);
            r.read(buffer, 0, buffer.length);
            String t = new String(buffer);
            String tEnd = t.equals(args[2]) ? "true" : "false";
            r.seek(r.length());
            r.write(tEnd.getBytes());
        }
    }
}
