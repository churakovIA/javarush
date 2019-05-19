package com.javarush.task.task31.task3106;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/*
Разархивируем файл
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        int count = args.length-1;
        String[] m = new String[count];
        for (int i = 0; i < count; i++) {
            m[i] = args[i+1];
        }
        Arrays.sort(m);

        ArrayList<FileInputStream> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(new FileInputStream(m[i]));
        }

        FileOutputStream out = new FileOutputStream(args[0]);
        SequenceInputStream secIn = new SequenceInputStream(Collections.enumeration(list));
        ZipInputStream zipIn = new ZipInputStream(secIn);
        try {
            ZipEntry entry;
            while((entry = zipIn.getNextEntry())!=null){
                byte[] buffer = new byte[1024];
                while (true){
                    int n = zipIn.read(buffer);
                    if(n == -1) break;
                    out.write(buffer, 0, n);
                }
            }
        } finally {
            secIn.close();
            zipIn.close();
            out.close();
        }
    }
}
