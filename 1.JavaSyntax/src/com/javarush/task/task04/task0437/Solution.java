package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {
        int eighth = 8;
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j<=i; j++){
                System.out.print(eighth);
            }
            System.out.println();
        }

    }
}
