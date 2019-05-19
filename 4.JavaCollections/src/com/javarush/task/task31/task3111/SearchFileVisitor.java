package com.javarush.task.task31.task3111;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        byte[] content = Files.readAllBytes(file); // размер файла: content.length

        String contentString = new String (content);

        boolean flag_partOfName = true;
        if(partOfName!=null && !file.getFileName().toString().contains(partOfName)) flag_partOfName = false;

        boolean flag_partOfContent = true;
        if(partOfContent!=null && !contentString.contains(partOfContent)) flag_partOfContent = false;

        boolean flag_maxSize = true;
        if(maxSize!=0 && content.length > maxSize) flag_maxSize = false;

        boolean flag_minSize = true;
        if(minSize!=0 && content.length < minSize) flag_minSize = false;

        if(flag_partOfName && flag_partOfContent && flag_minSize && flag_maxSize) foundFiles.add(file);

        return super.visitFile(file, attrs);
    }

    //------------------------------------------------------------------------------------------------------------------

    private String partOfName;
    private String partOfContent;
    private int minSize;
    private int maxSize;

    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
    }

    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }


    private List<Path> foundFiles = new ArrayList<>();

    public List<Path> getFoundFiles() {
        return foundFiles;
    }
}
