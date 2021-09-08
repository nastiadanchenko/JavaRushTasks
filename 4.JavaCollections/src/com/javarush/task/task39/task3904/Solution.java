package com.javarush.task.task39.task3904;

/*
Лестница
*/

public class Solution {
    private static int n = 70;

    public static void main(String[] args) {
        System.out.println("The number of possible ascents for " + n + " steps is: " + numberOfPossibleAscents(n));
    }

    public static long numberOfPossibleAscents(int n) {
        if (n<0) return 0;
        if (n<=1) return 1;
        if (n==2) return 2;
        if (n>2) return 3;
        return 0;

    }
}

