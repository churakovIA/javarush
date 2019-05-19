package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public class Cat implements Climb, Run {
    }

    public class Dog implements Run{
    }

    public class Tiger extends Cat {
    }

    public class Duck implements Fly, Run {
    }

    public interface Fly {static void fly(){}}
    public interface Climb {static void climb(){}}
    public interface Run {static void run(){}}

}
