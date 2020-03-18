package com.javarush.task.task07.task0704;

/* 
Переверни массив
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];


        for (int i=0; i<numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i=numbers.length-1; i>=0; i--) {
            System.out.println(numbers[i]);
        }





    }
}

