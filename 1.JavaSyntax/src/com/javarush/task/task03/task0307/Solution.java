package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg[] zergs = new Zerg[10];
        for (int i=0;i<10;i++) {zergs[i] = new Zerg(); zergs[i].name = "z"+i;}

        Protoss[] protosses = new Protoss[5];
        for (int i=0;i<5;i++) {protosses[i] = new Protoss(); protosses[i].name = "p"+i;}

        Terran[] terrans = new Terran[12];
        for (int i=0;i<12;i++) {terrans[i] = new Terran(); terrans[i].name = "t"+i;}
/*
        Zerg zerg1 = new Zerg().name = "a";
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        Zerg zerg6 = new Zerg();
        Zerg zerg7 = new Zerg();
        Zerg zerg8 = new Zerg();
        Zerg zerg9 = new Zerg();
        Zerg zerg10 = new Zerg();
*/
/*
        zerg1.name = "zerg1";
        zerg2.name = "zerg2";
        zerg3.name = "zerg3";
        zerg4.name = "zerg4";
        zerg5.name = "zerg5";
        zerg6.name = "zerg6";
        zerg7.name = "zerg7";
        zerg8.name = "zerg8";
        zerg9.name = "zerg9";
        zerg10.name = "zerg10";
*//*

        Protoss protoss1 = new Protoss();
        Protoss protoss2 = new Protoss();
        Protoss protoss3 = new Protoss();
        Protoss protoss4 = new Protoss();
        Protoss protoss5 = new Protoss();
        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();
        Terran terran5 = new Terran();
        Terran terran6 = new Terran();
        Terran terran7 = new Terran();
        Terran terran8 = new Terran();
        Terran terran9 = new Terran();
        Terran terran10 = new Terran();
        Terran terran11 = new Terran();
        Terran terran12 = new Terran();
*/
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
