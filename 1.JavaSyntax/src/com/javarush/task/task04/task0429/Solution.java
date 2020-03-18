package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;

        for (int i = 0; i <3; i++) {
            int value  = Integer.parseInt(reader.readLine());
            if(value> 0) a++;
            if(value<0) b++;
            }
        System.out.println("количество отрицательных чисел: "+b);
        System.out.println("количество положительных чисел: "+a);

    }
}
