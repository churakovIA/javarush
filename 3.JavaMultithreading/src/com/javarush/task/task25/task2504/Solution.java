package com.javarush.task.task25.task2504;

/*
Switch для нитей
*/
public class Solution {
    public static void processThreads(Thread... threads) {
        //implement this method - реализуйте этот метод
        for (Thread thread : threads){
            Thread.State currentState = thread.getState();
            switch (currentState){
                case NEW: thread.start();
                    break;
                case WAITING: thread.interrupt();
                    break;
                case RUNNABLE: if(thread.isInterrupted()) ;
                    break;
                case BLOCKED: thread.interrupt() ;
                    break;
                case TIMED_WAITING: thread.interrupt() ;
                    break;
                default: if(thread.getState() == Thread.State.TERMINATED) System.out.println(thread.getPriority());

            }
        }
    }

    public static void main(String[] args) {
    }
}
