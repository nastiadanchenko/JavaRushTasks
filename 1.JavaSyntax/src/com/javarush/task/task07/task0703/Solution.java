package com.javarush.task.task07.task0703;

/* 
Общение одиноких массивов
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        String [] strings = new String[10];
        int[] interger = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i<strings.length; i++) {
            strings[i] = scanner.nextLine();

        }
        for (int j = 0; j < interger.length; j++) {
            interger[j] = strings[j].length();
            System.out.println(interger[j]);
        }


    }
}
