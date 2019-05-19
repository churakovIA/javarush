package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {
//        if(args.length != 2) return;
        convert(args[0], args[1], "Windows-1251", "UTF-8");
        Charset currentCharset = Charset.defaultCharset();
//        String filefrom = "E:\\trash\\java\\source.txt";
//        String fileto = "E:\\trash\\java\\destination.txt";
//        convert(filefrom, fileto, "Windows-1251", "UTF-8");

/*
        String content = new String (Files.readAllBytes(Paths.get(filefrom)), Charset.forName("Windows-1251"));
//        Files.write(Paths.get(fileto), content.getBytes(Charset.forName("UTF-8")));
        try(PrintWriter writer = new PrintWriter(fileto, "UTF-8")){
            writer.print(content);
            writer.flush();
        }
*/

    }

    public static void convert(String filefrom, String fileto, String chsfrom, String chsto) throws IOException{
        try(Reader from = new BufferedReader(new InputStreamReader(new FileInputStream(filefrom), chsfrom));
            Writer to = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileto), chsto));){
            char[] buffer = new char[4096];
            int len;
            while ((len = from.read(buffer)) != -1){
                to.write(buffer, 0, len);
            }
        }
    }

}
