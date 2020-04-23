package com.javarush.task.task18.task1801;

/* 
Максимальный байт
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        try (FileInputStream inputStream = new FileInputStream(string)) {
            byte[] fileInArray = new byte[inputStream.available()];
            inputStream.read(fileInArray, 0, inputStream.available());
            int max = fileInArray[0];
            for (int i = 0; i < fileInArray.length; i++) {
                max = Math.max(max, fileInArray[i]);

            }
            System.out.println(max);
        }
    }
}
