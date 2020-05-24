package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
            List<Integer> list = new ArrayList<>();

            while (reader.ready()) {
                int i = Integer.parseInt(reader.readLine());
                if (i%2==0){
                    list.add(i);
                }
            }

            Collections.sort(list);
            for (int integer:list
                 ) {
                System.out.println(integer);
            }
        reader.close();
        // напишите тут ваш код
    }
}
