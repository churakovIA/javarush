package com.javarush.task.task28.task2805;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {

    public static AtomicInteger priority = new AtomicInteger(1);

    public void myPrior() {
        if (priority.get() > 10) {
            priority.set(1);
        }
        if (Thread.currentThread().getThreadGroup() != null && Thread.currentThread().getThreadGroup().getMaxPriority() < priority.get()) {
            priority.set(Thread.currentThread().getThreadGroup().getMaxPriority());
        }
        AtomicInteger realPrior = new AtomicInteger(priority.getAndIncrement());
        setPriority(realPrior.get());
    }

    public MyThread() {
        myPrior();
    }

    public MyThread(Runnable target) {
        super(target);
        myPrior();
    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
        myPrior();
    }

    public MyThread(String name) {
        super(name);
        myPrior();
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
        myPrior();
    }

    public MyThread(Runnable target, String name) {
        super(target, name);
        myPrior();
    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
        myPrior();
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
        myPrior();
    }
}
