package com.javarush.task.task07.task0711;

/* 
Удалить и вставить
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        for (int i=0; i<5; i++){
            list.add(reader.readLine());
        }
        for (int i=0; i<13; i++){
            String stringLast = list.get(list.size()-1);
            list.remove(stringLast);
            list.add(0,stringLast);
        }
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
