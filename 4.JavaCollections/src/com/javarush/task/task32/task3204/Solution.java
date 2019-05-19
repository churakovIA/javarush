package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* 
Генератор паролей
*/
public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {

        final int length = 8;
        List<String> charCategories = new ArrayList<>(3);
        charCategories.add("abcdefghijklmnopqrstuvwxyz");
        charCategories.add("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        charCategories.add("0123456789");
        StringBuilder password = new StringBuilder(length);
        Random random = new Random(System.nanoTime());
        int numCat = charCategories.size()-1;
        for (int i = 0; i < length; i++) {
            if(numCat<0) numCat = charCategories.size()-1;
            String charCategory = charCategories.get(numCat--);
            int position = random.nextInt(charCategory.length());
            password.append(charCategory.charAt(position));
        }

        //---------------------------------------------------------

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            outputStream.write(password.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return outputStream;
    }
}