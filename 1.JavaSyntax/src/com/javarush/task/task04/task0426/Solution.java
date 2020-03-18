package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import com.sun.javafx.geom.Crossings;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n  = Integer.parseInt(r.readLine());

        if (n > 0 && n%2 != 0)
            System.out.println("положительное нечетное число");
        if (n < 0 && n%2 != 0)
            System.out.println("отрицательное нечетное число");
        if (n > 0 && n%2 == 0)
            System.out.println("положительное четное число");
        if (n < 0 && n%2 == 0)
            System.out.println("отрицательное четное число");
        if (n == 0)
            System.out.println("ноль");

        //напишите тут ваш код
    }
}
