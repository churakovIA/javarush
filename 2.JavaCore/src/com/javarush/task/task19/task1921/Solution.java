package com.javarush.task.task19.task1921;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException{
        String f1 = "E:\\trash\\java\\source.txt";

        TreeMap<String, Double> map = new TreeMap<>();
        try (Scanner scanner = new Scanner(new FileReader(args[0]));) {
//        try (Scanner scanner = new Scanner(new FileReader(f1));) {
            while (scanner.hasNextLine()){
                String str = "";
                while (!scanner.hasNextInt()) str = str.concat(scanner.next()+" ");
                int d = scanner.nextInt();
                int m = scanner.nextInt();
                int y = scanner.nextInt();
                PEOPLE.add(new Person(str.trim(), new Date(m+"/"+d+"/"+y)));
            }
        }
    }
}
