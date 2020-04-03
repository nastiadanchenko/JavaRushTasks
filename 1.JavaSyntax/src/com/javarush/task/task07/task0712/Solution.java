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

        for (int i = 0; i < 10; i++) {
            String string = reader.readLine();
            list.add(string);
        }
        String[] list2 = new String[10];
        for (int i = 0; i < list.size(); i++) {
            list2[i] = list.get(i);
        }
        Comparator<String> comparator = new LengthComparator();
        Arrays.sort(list2, new LengthComparator());
        System.out.println(Arrays.toString(list2));
        for (String text : list
                ) {
            if (list2[0].equals(text) || list2[9].equals(text) ) {
                System.out.println(text);
                break;
            } /*if (text.equals(list2[9])) {
                System.out.println(text);

            }*/
        }
    }

    public static class LengthComparator implements java.util.Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    }
}