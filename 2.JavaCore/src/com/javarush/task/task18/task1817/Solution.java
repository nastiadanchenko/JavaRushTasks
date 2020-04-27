package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws IOException {
        int semvol = 0;
        int spase = 0;
        FileInputStream inputStream = new FileInputStream(args[0]);

        while (inputStream.available() > 0) {
            semvol++;
            if (inputStream.read() == ' ') spase++;
        }
        double result = ((double) spase / semvol * 100.0);

        System.out.println(String.format("%.2f", result));
        inputStream.close();
    }
}
