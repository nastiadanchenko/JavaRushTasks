package com.javarush.task.task07.task0708;

import sun.security.util.Length;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;



    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Solution.strings = new ArrayList<String>();
        ArrayList<Integer> index = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
            index.add(strings.get(i).length());
        }

        Collections.sort(index);
//        System.out.println(index);

        int indmax = strings.size()-1;

        int leghtmax = index.get(indmax);


        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i).length()==leghtmax){
                System.out.println(strings.get(i));
            }
        }

    }
}
