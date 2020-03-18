package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        int a1 = Integer.parseInt(s1);
        String s2 = reader.readLine();
        int b1 = Integer.parseInt(s2);
        String s3 = reader.readLine();
        int c1 = Integer.parseInt(s3);
        String s4 = reader.readLine();
        int d1 = Integer.parseInt(s4);
        System.out.println(MaxNumder(a1, b1, c1, d1));
    }

    public static int MaxNumder(int a, int b, int c, int d) {
        if (a < b) a = b;
        if (a < c) a = c;
        if (a < d) a = d;
        return a;


        //if (a < b) a =
        //напишите тут ваш код
    }
}
