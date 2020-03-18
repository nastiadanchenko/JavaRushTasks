package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        // int x = list.get(0).length();
        for (int i = 0; i < list.size()-1; i++) {
            int a = i + 1;
            if (list.get(i).length() <= list.get(a).length()) {
                continue;
            }

            if (list.get(i).length() > list.get(a).length()) {
                System.out.println(a);
                break;
            }
           /* if(x<list.get(i).length()) {
                x=list.get(i).length();

            }else  {
                System.out.println(i);
            }*/
        }
    }
}

