package com.javarush.task.task29.task2913;

import javafx.beans.binding.StringBinding;

import java.util.Random;

/* 
Замена рекурсии
*/

public class Solution {
    private static int numberA;
    private static int numberB;

    public static String getAllNumbersBetween(int a, int b) {
        StringBuilder result = new StringBuilder(String.valueOf(a));
        while(a != b) { result = a > b ? result.append(" " + --a) : result.append(" " + ++a); }
        return result.toString();
       /* if (a > b) {
            return getByAscending(a, b);
        } else {
            if (a == b) {
                return Integer.toString(a);
            }
            return getByDescending(a, b);
        }*/

    }

    public static String getByAscending(int a, int b) {
        StringBuilder sb = new StringBuilder();
        while (a != b) {
            sb.append(String.format(a-- + "%s", a == b ? "" : " "));
        }
        return sb.toString();
    }

    public static String getByDescending(int a, int b) {
        StringBuilder stb = new StringBuilder();
        while (a != b) {
            stb.append(String.format(++a + "%s", a == b ? "" : " "));
        }
        return stb.toString();
    }

    public static void main(String[] args) {
        Random random = new Random();
        numberA = random.nextInt(1000);
        numberB = random.nextInt(1000);
        System.out.println(getAllNumbersBetween(numberA, numberB));
        System.out.println(getAllNumbersBetween(numberB, numberA));
    }
}