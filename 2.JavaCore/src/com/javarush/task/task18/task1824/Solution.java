package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        while (true)
        {
            String fName = in.nextLine();
            try ( FileInputStream fileInputStream = new FileInputStream(fName) ) {

            } catch (FileNotFoundException e) {

                System.out.println(fName);
                break;
            }
        }
    }
}
