package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        if(n>0) {
            for (int i = 0; i < n; i++) {
                list.add(Integer.parseInt(reader.readLine()));
            }
            Collections.sort(list);
            Collections.reverse(list);
            int maximum = list.get(0);

            System.out.println(maximum);
        }
    }
}
