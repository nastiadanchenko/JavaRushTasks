package com.javarush.task.task18.task1802;

/* 
Минимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(reader.readLine())){
            byte[] array = new byte[inputStream.available()];
            inputStream.read(array, 0, inputStream.available());
            Arrays.sort(array);
            System.out.println(array[0]);
        }
    }
}
