package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine(), s = "";
        s = s + string.substring(0, 1).toUpperCase(); // первый символ заглавный
        for (int i = 1; i < string.length(); i++) {
            if (" ".equals(string.substring(i-1,i))) // проверяем пробел слева
                s += string.substring(i, i + 1).toUpperCase();
            else s += string.substring(i, i + 1);
        }
        System.out.println(s);


        //напишите тут ваш код
    }
}
