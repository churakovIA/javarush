package com.javarush.task.task26.task2611;

import java.util.concurrent.ConcurrentHashMap;

public class Producer implements Runnable{
    private ConcurrentHashMap<String, String> map;

    public Producer(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }

    @Override
    public void run() {
        Thread th = Thread.currentThread();
        int counter = 1;
        while (!th.isInterrupted()){
            map.putIfAbsent(String.valueOf(counter), String.format("Some text for %s", counter));
            counter++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.printf("%s thread was terminated", th.getName());
                break;
            }
        }
    }
}
