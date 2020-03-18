package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sAge1 = reader.readLine();
        int nAge1 = Integer.parseInt(sAge1);
        String sAge2 = reader.readLine();
        int nAge2 = Integer.parseInt(sAge2);
        System.out.print(name + " получает " + nAge1 + " через " + nAge2 + " лет.");
        //напишите тут ваш код
    }
}
