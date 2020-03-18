package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n1  = Integer.parseInt(r.readLine());
        int n2  = Integer.parseInt(r.readLine());
        int n3  = Integer.parseInt(r.readLine());

        int a = 0;
        int b = 0;
        int c = 0;

        if (n1 > 0)
            a = 1;
        if (n2 > 0)
            b = 1;
        if (n3 > 0)
            c = 1;
        System.out.println(a + b + c);




        //напишите тут ваш код

    }
}
