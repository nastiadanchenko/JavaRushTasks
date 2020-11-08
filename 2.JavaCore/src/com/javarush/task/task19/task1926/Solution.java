package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                System.out.println(new StringBuilder(line).reverse());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
