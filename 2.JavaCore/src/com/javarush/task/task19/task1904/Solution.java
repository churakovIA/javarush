package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String[] tokens = fileScanner.nextLine().split(" ");

            return new Person(tokens[1],
                                tokens[2],
                                tokens[0],
                                new Date(tokens[4] + "/"+
                                        tokens[3] + "/"+
                                        tokens[5])
            );
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
