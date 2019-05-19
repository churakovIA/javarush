package com.javarush.task.task16.task1632;

public class MyMessage extends Thread implements Message {
    //private boolean isRun;
    @Override
    public void showWarning() {
        //isRun = false;
        interrupt();
    }

    @Override
    public void run() {
        while (!isInterrupted());
/*
        isRun = true;
        while (isRun){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                return;
            }
        }
*/
    }
}
