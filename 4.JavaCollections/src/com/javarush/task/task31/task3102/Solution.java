package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

/* 
Находим все файлы
*/

public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        File originalFile = new File(root);

       // File folder = originalFile.getParentFile();

        List<String> listresult = new ArrayList<>();
        Queue<File> stats = new PriorityQueue<>();

        Collections.addAll(stats, originalFile.listFiles());

        /*for (File file: originalFile.listFiles()
             ) {
            stats.add(file);
        }*/
        while (!stats.isEmpty()){
            File currentFile = stats.remove();
            if (currentFile.isDirectory()){
                Collections.addAll(stats, currentFile.listFiles());
            }else {
                listresult.add(currentFile.getAbsolutePath());
            }
        }
        return listresult;

    }

    public static void main(String[] args) {

    }
}
