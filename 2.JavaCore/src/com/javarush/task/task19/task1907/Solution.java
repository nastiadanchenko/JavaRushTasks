package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            FileReader fileReader = new FileReader(reader.readLine());
            int i = 0;
            StringBuilder stringBuilder = new StringBuilder();
            while (fileReader.ready()) {
                stringBuilder.append((char) fileReader.read());
            }
                String[] strings = new String(stringBuilder).split("\\W+"); // \W+ -  убираем все символы отличные от букв и цифр
                for (String s:strings
                     ) {if (s.equals("world")) i++;

                }

            System.out.println(i);

            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
