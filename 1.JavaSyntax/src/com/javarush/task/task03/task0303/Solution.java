package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(1, 35.5));
        System.out.println(convertEurToUsd(10, 67/7));
        //напишите тут ваш код
    }

    public static double convertEurToUsd(int eur, double course) {
        double dollar = eur * course;
        return dollar;
        //напишите тут ваш код
    }
}
