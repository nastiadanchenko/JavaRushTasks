package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int[] length = new int[10];
        for (int i = 0; i < 10; i++) {
            String string = reader.readLine();
            list.add(string);
            length[i] = list.get(i).length();
        }
        Arrays.sort(length);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == length[0] || list.get(i).length() == length[9]) {
                System.out.println(list.get(i));
                break;
            }
        }


    }
}