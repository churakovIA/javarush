package com.javarush.task.task25.task2508;

public class TaskManipulator implements Runnable, CustomThreadManipulator {

    private Thread trd;


    @Override
    public void run() {
        while (true){
            System.out.println(trd.getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    @Override
    public void start(String threadName) {
        trd = new Thread(this, threadName);
        trd.start();
    }

    @Override
    public void stop() {
        trd.interrupt();
    }
}
