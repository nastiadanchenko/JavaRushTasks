package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int x = 0;

        for (int i = 0; i <3 ; i++) {
            list.add(Integer.parseInt(reader.readLine()));

        }
        Collections.sort(list);
        System.out.println(list.get(1));
    }

}
