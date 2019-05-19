package com.javarush.task.task31.task3101;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;

/*
Проход по дереву файлов
*/
public class Solution {
    public static void main(String[] args) {

        File path = new File(args[0]);
        File source = new File(args[1]);
        File destination = new File(source.getParent() + "/allFilesContent.txt");
        if(FileUtils.isExist(source))
            FileUtils.renameFile(source, destination);

//        File path = new File("E:\\Short-term storage\\qwer");
//        Path resultFileAbsolutePath = Paths.get("res.txt");

        ArrayList<File> list = new ArrayList<>();
        toList(list, path);
        Collections.sort(list, (f, s) -> f.getName().compareTo(s.getName()));
        //list.forEach(file -> {System.out.println(file);}); // вывод списка

//        File old = resultFileAbsolutePath.toFile();
//        resultFileAbsolutePath = resultFileAbsolutePath.resolveSibling("allFilesContent.txt");
//        FileUtils.renameFile(old, resultFileAbsolutePath.toFile());
//        if(FileUtils.isExist(old)) FileUtils.deleteFile(old);

        try(FileOutputStream fos = new FileOutputStream(destination);
            ){
            for(File f : list){
                try {
                    Files.copy(f.toPath(), fos);
                    fos.write('\n');
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void toList(ArrayList<File> list, File path){
        for (File file : path.listFiles()){
            if(file.isDirectory())
                toList(list, file);
            else if(file.length()<=50)
                list.add(file);
        }
    }

}
