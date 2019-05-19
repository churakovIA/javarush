package com.javarush.task.task25.task2506;

public class LoggingStateThread  extends Thread{
    private Thread target;
    private Thread.State state;

    public LoggingStateThread(Thread target) {
        this.target = target;
        //this.state = target.getState();
    }

    @Override
    public void run() {
//        super.run();
        while (true){
            verifyState();
            if(state == State.TERMINATED) break;
        }
    }

    private void verifyState(){
        Thread.State cur = target.getState();
        if(state!= cur){
            state = cur;
            System.out.println(state);
        }
    }

}