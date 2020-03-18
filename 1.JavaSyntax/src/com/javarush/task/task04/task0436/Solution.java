package com.javarush.task.task04.task0436;

/* 
Рисуем прямоугольник
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scannerVertical = new Scanner(System.in);
        Scanner scannerHorizontal = new Scanner(System.in);
        int eighth = 8;
        int m  = scannerHorizontal.nextInt();
        int n = scannerVertical.nextInt();


        for (int i = 0; i <m ; i++) {
            for (int j = 0; j<n; j++){
                System.out.print(eighth);
            }
            System.out.println();
        }


    }
}
