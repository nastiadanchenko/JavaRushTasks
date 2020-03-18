package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1 = reader.readLine();
        int a = Integer.parseInt(n1);
        String n2 = reader.readLine();
        int b = Integer.parseInt(n2);
        String n3 = reader.readLine();
        int c = Integer.parseInt(n3);

        if (a == b & b != c )
            System.out.println("3");
        if (b == c & c != a)
            System.out.println("1");
        if (a == c & c != b)
            System.out.println("2");

        //напишите тут ваш код
    }
}
