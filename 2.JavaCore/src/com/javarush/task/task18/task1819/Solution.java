package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 =reader.readLine();
        reader.close();

        FileInputStream fileInputStream = new FileInputStream(file1);// сначала считываем первый файл
        int file1Data = 0;
        byte[] buffer1 = new byte[fileInputStream.available()];
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read(buffer1);
            file1Data = data; // и записываем в како-то буффер
        }

        FileOutputStream fileOutputStream = new FileOutputStream(file1);// открыт поток для записи в 1 файл
        FileInputStream fileInputStream2 = new FileInputStream(file2); // открыт поток для чтения 2 файл
        while (fileInputStream2.available() > 0) {
            int dt = fileInputStream2.read();
            fileOutputStream.write(dt);
        } // перекидываем данные из файла 2 в файл один

        fileOutputStream.write(buffer1, 0, file1Data); //дописываем данные из буффера
        fileInputStream2.close();
        fileInputStream.close();
        fileOutputStream.close();


    }

    }

