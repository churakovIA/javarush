package com.javarush.task.task16.task1630;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    public static volatile BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static {
        try {
            firstFileName = in.readLine();
            secondFileName = in.readLine();
        } catch (IOException e) {

        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();

        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface{
        private String fileName = "";
        private String fileContent = "";

        public void run() {
            try {
                fileContent = new String(Files.readAllBytes(Paths.get(fileName)));
                fileContent = fileContent.join(" ", Arrays.asList(fileContent.split(System.getProperty("line.separator"))) );
            } catch (IOException e) {

            }
        }

        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        public String getFileContent() {
            return fileContent;
        }
    }
}
