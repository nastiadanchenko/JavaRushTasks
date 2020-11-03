package com.javarush.task.task32.task3210;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) {
        int number = Integer.parseInt(args[1]);
        String text = args[2];


        try (RandomAccessFile raf = new RandomAccessFile(args[0], "rw")) {
            raf.seek(number);

            byte[] buff = new byte[args[2].length()];
            raf.read(buff, 0, args[2].length());
            String buffText = new String(buff);

            raf.seek(raf.length());
            if (buffText.equals(text)) {
                raf.write("true".getBytes());
            } else {
                raf.write("false".getBytes());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
