package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String fileName = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
            fileName = br.readLine();
        }
        catch (IOException e){
            return;
        }

        int countworld = 0;

        try(BufferedReader in = new BufferedReader(new FileReader(fileName));
            ){
            String str;
            while ((str = in.readLine()) != null){
                countworld+=Arrays.asList(str.split("\\PL+")).stream().filter(w->w.equals("world")).count();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(countworld);
    }
}
