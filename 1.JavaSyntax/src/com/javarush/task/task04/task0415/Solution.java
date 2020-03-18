package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);
        String z = reader.readLine();
        int b = Integer.parseInt(z);
        String x = reader.readLine();
        int c = Integer.parseInt(x);
        if ((a + b) > c & (a + c) > b & (c + b) > a)
        System.out.println("Треугольник существует.");
        else
        System.out.println("Треугольник не существует.");//напишите тут ваш код
    }
}