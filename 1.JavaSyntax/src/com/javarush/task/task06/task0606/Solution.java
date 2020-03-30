package com.javarush.task.task06.task0606;

/* 
Чётные и нечётные циферки
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static int even;
    public static int odd;


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(reader.readLine());
        String s = String.valueOf(value); // преобразуем int в String
        char[] chars = s.toCharArray(); // разбиваем String на символы и помещаем в массив
        for (int i = 0; i < chars.length; i++) {
            int v = Integer.valueOf(chars[i]); // преобразуем символ обратно в int
            if (v % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: " + even + " Odd: " + odd);


    }
}
