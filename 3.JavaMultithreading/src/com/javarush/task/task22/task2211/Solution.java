package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        File fileInput = new File(args[0]);
        File fileOutput = new File(args[1]);
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileInput));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileOutput))){
            Charset windows1251 = Charset.forName("Windows-1251");
            Charset UTF8 = Charset.forName("UTF-8");
            byte[] buff = new byte[bis.available()];
                bis.read(buff);
                String s = new String(buff,windows1251);
                bos.write(s.getBytes(UTF8));


        }

    }
}
