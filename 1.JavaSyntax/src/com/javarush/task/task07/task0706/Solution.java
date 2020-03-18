package com.javarush.task.task07.task0706;

import java.io.IOException;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       int[] street = new int[15];
        Scanner scanner = new Scanner(System.in);

        for (int i =0; i<street.length; i++){
            street[i] = scanner.nextInt();
        }
        int sum1 = 0;
        int sum2 = 0;
            for (int i = 0; i<street.length; i++){
                if (i%2==0) sum1+= street[i];
                else sum2+=street[i];
            }
        if (sum1>sum2)System.out.println("В домах с четными номерами проживает больше жителей.");
        if (sum1<sum2)System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
