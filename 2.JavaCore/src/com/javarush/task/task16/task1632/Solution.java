package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread(() -> {while (true){}}));
        threads.add(new Thread(() -> {
            try {Thread.sleep(1);}
            catch (InterruptedException e) {System.out.println("InterruptedException");};
        }));
        threads.add(new Thread(() -> {
            while (true){
                System.out.println("Ура");
                try {Thread.sleep(500);} catch (InterruptedException e) {}
            }
        }));
        threads.add(new MyMessage());
        threads.add(new Thread(() -> {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            String str = "";
            try {
                while (!(str = in.readLine()).equals("N")){
                    sum += Integer.parseInt(str);
                }
            } catch (IOException e) {

            }
            System.out.println(sum);
        }));
    }

    public static void main(String[] args) {
    }


}