package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(14, 7);
    }

    public static void closeToTen(int a, int b) {
        int s1 = a - 10;
        s1 = abs(s1);
        int s2 = b - 10;
        s2 = abs(s2);
        if (s1 < s2)
            System.out.println(a);
        else {
            if (s1 > s2) System.out.println(b);
            else System.out.println(a);
        }
        }
                //::CODE:

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}