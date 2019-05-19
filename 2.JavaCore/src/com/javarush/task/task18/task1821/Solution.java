package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {
        HashMap<Character, Integer> map = new HashMap<>();
        TreeSet<Integer> set = new TreeSet<>();
        FileInputStream fis = new FileInputStream(args[0]);
//        FileInputStream fis = new FileInputStream("E:\\trash\\java\\source.txt");
        while (fis.available()>0)
        {
            int code = fis.read();
            map.merge((char) code, 1, Integer::sum);
            set.add(code);
        }
        set.forEach(integer ->
        {
            char ch = (char) integer.intValue();
            System.out.println( ch + " " + map.get(Character.valueOf( ch )));
        } );
        fis.close();
    }
}
