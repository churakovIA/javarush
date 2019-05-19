package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String fname1 = "E:\\trash\\java\\source.png";
        String fname2 = "E:\\trash\\java\\destination.png";
//        String fname1 = in.readLine();
//        String fname2 = in.readLine();

        FileInputStream inputStream = new FileInputStream(fname1);
        FileOutputStream outputStream = new FileOutputStream(fname2);

        byte[] buffer = new byte[inputStream.available()];
        int count = inputStream.read(buffer);
        for(int i = count-1; i>=0; i--)
            outputStream.write(buffer[i]);

        inputStream.close();
        outputStream.close();

        InputStream inputStream1 = System.in;

    }
}
