package com.javarush.task.task20.task2003;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() {
        //implement this method - реализуйте этот метод
        Scanner in = new Scanner(System.in);
        String fname = in.nextLine();
        in.close();

        try (InputStream input = new FileInputStream(fname)) {
            load(input);

        } catch (Exception e){}
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties settings = new Properties();
        settings.putAll(properties);
        settings.store(outputStream, "");
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties settings = new Properties();
        settings.load(inputStream);
        settings.forEach((k,v)->properties.put((String) k, (String) v));

        //properties.putAll(settings);
    }

    public static void main(String[] args) {

    }
}
