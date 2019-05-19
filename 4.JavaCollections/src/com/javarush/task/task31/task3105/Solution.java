package com.javarush.task.task31.task3105;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* 
Добавление файла в архив
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        String zipName = args[1];
//        String fileName = "E:\\Short-term storage\\t1\\e.xlsx";
//        String zipName = "E:\\Short-term storage\\t1\\test.zip";
/*
        Path path = Paths.get("E:/Short-term storage/1.zip");
        ZipFile zipFile = new ZipFile(path.toFile());
        ZipEntry entry = zipFile.getEntry("1.txt");
        InputStream zipFileInputStream = zipFile.getInputStream(entry);
        byte[] array = new byte[zipFileInputStream.available()];
        zipFileInputStream.read(array);

        Path unzip = Files.createFile(Paths.get("E:/Short-term storage/2.txt"));
        Files.write(unzip, array);
*/


/*
//        Map<ZipEntry, Byte[]>
        Path pathZIP = Paths.get(zipName);
        ArrayList<byte[]> list = new ArrayList<>();
        try (ZipInputStream inputZIP = new ZipInputStream(Files.newInputStream(pathZIP));
//             ZipOutputStream outputZIP = new ZipOutputStream(Files.newOutputStream(pathZIP))
             ZipOutputStream outputZIP = new ZipOutputStream(new ByteArrayOutputStream())
        ){
            ZipEntry entry;
            while ((entry = inputZIP.getNextEntry()) != null){
                System.out.println(entry);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
        Path pathZIP = Paths.get(zipName);
        ZipFile zipFile = new ZipFile(zipName);
        HashMap<String, ByteArrayOutputStream> map = new HashMap<>();
        try(ZipInputStream in = new ZipInputStream(Files.newInputStream(pathZIP))){
            ZipEntry entry;
            while((entry = in.getNextEntry()) != null){

                ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
                byte[] buffer = new byte[1024];
                while (true){
                    int n = in.read(buffer);
                    if(n == -1) break;
                    byteOut.write(buffer, 0, n);
                }
                map.put(entry.getName(), byteOut);
            }
        }

        File file = new File(fileName);
        try(ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipName))){

            for(Map.Entry<String, ByteArrayOutputStream> mapEntry : map.entrySet()){
                if (mapEntry.getKey().substring(mapEntry.getKey().lastIndexOf("/") + 1).equals(file.getName())) continue;
                out.putNextEntry(new ZipEntry(mapEntry.getKey()));
                out.write(mapEntry.getValue().toByteArray());
            }

            out.putNextEntry(new ZipEntry("new/"+file.getName()));
            Files.copy(file.toPath(), out);

        }

    }
}
