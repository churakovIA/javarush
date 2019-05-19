package com.javarush.task.task25.task2512;

import java.util.ArrayDeque;

/*
Живем своим умом
*/
public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        t.interrupt();

        Throwable nextE = e;
        ArrayDeque<String> deque = new ArrayDeque<>();
        do{
            String msg = String.format("%s: %s", nextE.getClass().getName(), nextE.getMessage());
            deque.push(msg);
        } while ((nextE = nextE.getCause())!=null);
        deque.forEach(System.out::println);

    }

    public static void main(String[] args) {
        new Solution().uncaughtException(Thread.currentThread(), new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI"))));
//        Thread test = new TestClass();
//        test.setUncaughtExceptionHandler(new Solution());
//        test.start();
    }

//    public static class TestClass extends Thread{
//        @Override
//        public void run() {
//                throw new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI")));
//        }
//    }

}
