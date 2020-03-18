package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Integer> index = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
            index.add(list.get(i).length());
        }

        Collections.sort(index);
       // System.out.println(index);

        int lengthmin = index.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length()==lengthmin){
                System.out.println(list.get(i));
            }

        }
    }
}
