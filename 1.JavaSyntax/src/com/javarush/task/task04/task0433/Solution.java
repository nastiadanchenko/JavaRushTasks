package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        String s = "S";
        int i = 1;
        int n = 10;
        while (i <=n) {
            int j = 1;
            while (j < n) {
                System.out.print(s);
                j++;
            }
            System.out.println(s);
            i++;
        }

    }
}
