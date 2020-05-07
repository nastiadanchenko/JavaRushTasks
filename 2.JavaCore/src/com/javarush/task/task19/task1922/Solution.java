package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
             FileReader fileReader = new FileReader(reader.readLine());
        BufferedReader rederFile = new BufferedReader(fileReader)){

            while (rederFile.ready()){
                String string = rederFile.readLine(); // записываем построчно
                List<String> list = new ArrayList<>(Arrays.asList(string.split(" "))); // распиливаем строки по пробелу, возвращаем их в виде списка
                int count = 0;
                for (String s : words
                     ) {
                    count += Collections.frequency(list, s); // ищем количество совпатений в списку, сравнивая сщ значениями из списка words
                }
                if (count==2) {System.out.println(string); 
                }
            }

        }
    }
}
