package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int i = 1;
        int n = 10;
        while (i <=n) {
            int j = 1;
            while (j < n) {
                System.out.print(i * j + " ");
                j++;
            }
            System.out.println(i * j + " ");
            i++;
        }
    }
}
