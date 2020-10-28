package com.javarush.task.task31.task3106;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* 
Разархивируем файл
*/

public class Solution {
    public static void main(String[] args) {
        String resultFileName = args[0];
        String[] fileNamePart = new String[args.length-1];

        for (int i = 0; i <fileNamePart.length ; i++) {
            fileNamePart[i] = args[i + 1];
        }
        Arrays.sort(fileNamePart);

        List<FileInputStream> listFIS = new ArrayList<>();
        for (String zip: fileNamePart
             ) {
            try {
                listFIS.add(new FileInputStream(zip));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }


        try (ZipInputStream zis = new ZipInputStream(new SequenceInputStream(Collections.enumeration(listFIS)));
             BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(resultFileName))) {
            byte[] buf = new byte[1024*1024];

            while (zis.getNextEntry()!=null){
                int x;
                while ((x=zis.read(buf))!=-1){
                    fos.write(buf,0,x);
                    fos.flush();
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
