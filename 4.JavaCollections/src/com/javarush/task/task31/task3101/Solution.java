package com.javarush.task.task31.task3101;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

/* 
Проход по дереву файлов
*/

public class Solution {
  //  private static List<File> listFile = new ArrayList<>();
    public static void main(String[] args) {
        File path = new File(args[0]);
        File resultFileAbsolutePath = new File(args[1]);
        File allFilesContent = new File(resultFileAbsolutePath.getParent() + "/allFilesContent.txt");
        FileUtils.renameFile(resultFileAbsolutePath, allFilesContent);

        try (FileOutputStream fos = new FileOutputStream(allFilesContent)) {
            List<File> listFile = new ArrayList<>();

            listFile = fillFileList(path);

            listFile.sort(new Comparator<File>() {
                @Override
                public int compare(File o1, File o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });

            for (File file:listFile
                 ) {
                FileInputStream fis = new FileInputStream(file);
                while (fis.available()>0)
                    fos.write(fis.read());
                fos.write(System.lineSeparator().getBytes()); // записывает с '\n'
                fos.flush();
                fis.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Рекурсивно пробегаем поддиректории и заполняем список файлов
    private static ArrayList<File> fillFileList(File path) {
        // копипаст :((
        ArrayList<File> fileList = new ArrayList<>();
        File file = new File(path.getAbsolutePath());

        for(File entry: file.listFiles()){
            if(entry.isDirectory()) {
                ArrayList<File> innerFiles = fillFileList(entry);
                for(File inner: innerFiles){
                    fileList.add(inner);
                }
            }else{
                if (entry.length() > 50) {
                    FileUtils.deleteFile(entry);
                } else {
                    fileList.add(entry);
                }
            }
        }
        return fileList;
    }

}
