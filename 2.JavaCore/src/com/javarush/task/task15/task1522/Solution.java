package com.javarush.task.task15.task1522;

import java.util.Scanner;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        Scanner in = new Scanner(System.in);
        String p = in.nextLine();
        if(p.equals(Planet.SUN)) thePlanet = Sun.getInstance();
        else if(p.equals(Planet.EARTH)) thePlanet = Earth.getInstance();
        else if(p.equals(Planet.MOON)) thePlanet = Moon.getInstance();
        else thePlanet = null;

        in.close();

    }
}
