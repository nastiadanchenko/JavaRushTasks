package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* 
Что внутри папки?
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        AtomicInteger countFiles = new AtomicInteger();
        AtomicLong sizeDirect = new AtomicLong();
        AtomicInteger countDirect = new AtomicInteger();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            Path path = Paths.get(reader.readLine());
            if (Files.isDirectory(path)) {
                Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
                    @Override
                    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                        countFiles.incrementAndGet();
                        sizeDirect.addAndGet(attrs.size());
                        return FileVisitResult.CONTINUE;
                    }

                    @Override
                    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                        countDirect.incrementAndGet();
                        return FileVisitResult.CONTINUE;
                    }
                });
                System.out.println("Всего папок - "+countDirect.decrementAndGet());
                System.out.println("Всего файлов - "+countFiles.toString());
                System.out.println("Общий размер - "+sizeDirect.toString());
            }else {
                System.out.println(path+" - не папка");
            }

        }
    }
}
