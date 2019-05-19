package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args){
        String f1 = null;
        String f2 = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
            f1 = br.readLine();
            f2 = br.readLine();
        }
        catch (IOException e){
            return;
        }


        try(FileReader in = new FileReader(f1);
            FileWriter out = new FileWriter(f2)){
            int ch;
            int i = 0;
            while ((ch = in.read()) != -1){
                if(++i%2 == 0) out.write(ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//E:\trash\java\source.txt
//E:\trash\java\destination.txt