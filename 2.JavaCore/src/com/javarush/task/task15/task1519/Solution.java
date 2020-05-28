package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string;
        while (!(string = reader.readLine()).equals("exit")){
            try {
                if (string.contains(".")){
                    print(Double.parseDouble(string));
                    continue;
                }
                int integer = Integer.parseInt(string);
                if (integer<=0 || integer>=128){
                    print(integer);
                    continue;
                }
                short shorts = Short.parseShort(string);
                if (shorts>0 || shorts<128) {
                    print(shorts);
                    continue;
                }
            } catch (Exception e) {
                print(string);
            }

        }

        //напиште тут ваш код

    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
