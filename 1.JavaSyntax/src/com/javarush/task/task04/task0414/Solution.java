package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int x = Integer.parseInt(s);
        if ((x % 4 == 0) && !(x % 100 ==0) || (x % 400 == 0))
            System.out.println("количество дней в году: 366");
        else System.out.println("количество дней в году: 365");
        //напишите тут ваш код
    }
}