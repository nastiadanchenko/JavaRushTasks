package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        int n = Integer.parseInt(reader1.readLine());
        int m = Integer.parseInt(reader2.readLine());
        for (int i = 0; i <n; i++) {
            String string = reader3.readLine();
            list.add(string);
        }

            for (int i = 0; i <m ; i++)
               list.add(list.remove(0));


        list.forEach(s -> System.out.println(s+" "));

    }
}
