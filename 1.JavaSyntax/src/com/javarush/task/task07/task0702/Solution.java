package com.javarush.task.task07.task0702;

/* 
Массив из строчек в обратном порядке
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] list = new String[10];
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<8; i++ ){
            list[i]= scanner.nextLine();
        }
        for (int i=list.length-1; i>=0; i--){
            System.out.println(list[i]);
        }
    }
}