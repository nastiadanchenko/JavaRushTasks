package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        int maximum;
        int minimum;

        for (int i = 0; i <20; i++) {
            int value = Integer.parseInt(reader.readLine());
            array[i] = value;
        }

        Arrays.sort(array);
        minimum = array[0];
        maximum = array[19];
        System.out.print(maximum + " " + minimum);
    }
}
