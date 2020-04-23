package com.javarush.task.task18.task1805;

/* 
Сортировка байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        try (FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine())){
            long[] arrayBate = new long[256];
            while (inputStream.available()>0){
                arrayBate[inputStream.read()]++;
            }
            for (int i = 0; i<arrayBate.length ; i++) {
                if (arrayBate[i]>0) System.out.print(i+" ");
            }
        }
    }
}
