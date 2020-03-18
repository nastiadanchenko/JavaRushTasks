package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scannerNumber = new Scanner(System.in);
        int sum = 0;

        while (true){
            int number = scannerNumber.nextInt();
            if(number ==-1) {
                System.out.println(sum-1);
                break;
            }else {
                sum +=number;

            }

        }
       /* BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        for (int b = 0; b != -1; a += b) b = Integer.parseInt(reader.readLine());
        System.out.println(a);
*/
    }
}
