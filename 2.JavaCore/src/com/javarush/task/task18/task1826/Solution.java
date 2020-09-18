package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) {
        String fileName = null;
        try (FileInputStream fis = new FileInputStream(args[1]);
             FileOutputStream fos = new FileOutputStream(args[2])) {
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            for (byte element:buffer
                 ) {
                if (args[0].equals("-e")) fos.write(element+1);
                if (args[0].equals( "-d"))fos.write(element-1);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
