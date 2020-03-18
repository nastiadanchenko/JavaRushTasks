package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);
        String s1 = reader.readLine();
        int b = Integer.parseInt(s1);
        String s2 = reader.readLine();
        int c = Integer.parseInt(s2);
        if (a >= b & b >= c)
            System.out.println(a + " " + b + " " + c);
        else if (b >= a & a >= c)
            System.out.println(b + " " + a + " " + c);
        else if (c >= a & a >= b)
            System.out.println(c + " " + a + " " + b);
        else if (a >= c & c >= b)
            System.out.println(a + " " + c + " " + b);
        else if (b >= c & c >= a)
            System.out.println(b + " " + c + " " + a);
        else if (c >= b & b >= a)
            System.out.println(c + " " + b + " " + a);

        //напишите тут ваш код
    }
}
