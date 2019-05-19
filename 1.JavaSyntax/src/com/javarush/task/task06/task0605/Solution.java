package com.javarush.task.task06.task0605;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.massIndex(weight, height);
    }

    public static class Body {
        public static void massIndex(double weight, double height) {
            double index = weight / Math.pow(height, 2.0);
            String message;
            if (index<18.5) message = "Недовес: меньше чем 18.5";
            else if (index>=18.5 && index<=24.9) message = "Нормальный: между 18.5 и 24.9";
            else if (index>=25.0 && index<29.9) message = "Избыточный вес: между 25 и 29.9";
            else message = "Ожирение: 30 или больше";

            System.out.println(message);
        }
    }
}

/*
«Недовес: меньше чем 18.5» — если индекс массы тела меньше 18.5,
«Нормальный: между 18.5 и 24.9» — если индекс массы тела между 18.5 и 24.9,
«Избыточный вес: между 25 и 29.9» — если индекс массы тела между 25 и 29.9,
«Ожирение: 30 или больше» — если индекс массы тела 30 или больше.
*/

