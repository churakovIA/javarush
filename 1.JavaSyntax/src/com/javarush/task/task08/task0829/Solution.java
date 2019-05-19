package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        Map<String, String> addresses = new HashMap<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) break;
            //else {
            String city = reader.readLine();
            if (city.isEmpty()) break;

            addresses.put(family, city);
            //}
        }

        //read home number
        //int houseNumber = Integer.parseInt(reader.readLine());
        String city = reader.readLine();

        //if (addresses.containsKey(city)) {
            //String familySecondName = addresses.get(houseNumber);
            System.out.println(addresses.get(city));
        //}

//        //list of addresses
//        List<String> addresses = new ArrayList<String>();
//        while (true) {
//            String family = reader.readLine();
//            if (family.isEmpty()) break;
//
//            addresses.add(family);
//        }
//
//        //read home number
//        int houseNumber = Integer.parseInt(reader.readLine());
//
//        if (0 <= houseNumber && houseNumber < addresses.size()) {
//            String familySecondName = addresses.get(houseNumber);
//            System.out.println(familySecondName);
//        }
    }
}
