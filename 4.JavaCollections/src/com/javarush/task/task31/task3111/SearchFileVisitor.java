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
    private String partOfName = null;
    private String partOfContent = null;
    private int minSize = 0;
    private int maxSize = 0;
    private List<Path> foundFiles = new ArrayList<>();
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        byte[] contentByte = Files.readAllBytes(file); // размер файла: content.length

        boolean isFitWithFilter = true;

        if(partOfName!=null&&isFitWithFilter){
            isFitWithFilter = file.getFileName().toString().contains(partOfName);
        }
        if(partOfContent!=null&&isFitWithFilter){
            isFitWithFilter = Files.readAllLines(file).toString().contains(partOfContent);
        }
        if(minSize!=0&&isFitWithFilter){
            isFitWithFilter = attrs.size()>minSize;
        }
        if(maxSize!=0&&isFitWithFilter){
            isFitWithFilter = attrs.size()<maxSize;
        }

        if(isFitWithFilter) foundFiles.add(file);

        // непропустил валик :((
        /*boolean containsName = true;
        if(partOfName!=null && !file.getFileName().toString().contains(partOfName))
            containsName = false;

        String content = new String(Files.readAllBytes(file));
        boolean containsContent = true;
        if(partOfContent!=null && !content.contains(partOfContent))
            containsContent = false;

        boolean minSizeCheck = true;
        if (attrs.size()!=0&&attrs.size()>minSize)
            minSizeCheck = false;

        boolean maxSizeCheck = true;
        if (attrs.size()!=0&&attrs.size()<maxSize)
            maxSizeCheck = false;

        if(containsName && containsContent&&minSizeCheck&&maxSizeCheck)
            foundFiles.add(file);*/

        return FileVisitResult.CONTINUE;
    }


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

    public List<Path> getFoundFiles() {
        return foundFiles;
    }
}
