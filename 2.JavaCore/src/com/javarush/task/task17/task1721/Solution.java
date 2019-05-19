package com.javarush.task.task17.task1721;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);

        loadFileInList(allLines, in.nextLine());
        loadFileInList(forRemoveLines, in.nextLine());

        in.close();

        new Solution().joinData();

    }

    public void joinData () throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) allLines.removeAll(forRemoveLines);
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }

    private static void loadFileInList(List<String> list, String path) throws IOException{
        String contents = new String(Files.readAllBytes(Paths.get(path)));
        list.addAll(Arrays.asList(contents.split(System.getProperty("line.separator"))));
    }

}
