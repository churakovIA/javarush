package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут

        SpecialThread[] specialThreads = new SpecialThread[5];
        for(int i = 0; i<specialThreads.length;i++) specialThreads[i] = new SpecialThread();

        for(int i = 0; i<specialThreads.length;i++) list.add(new Thread(specialThreads[i]));

    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
