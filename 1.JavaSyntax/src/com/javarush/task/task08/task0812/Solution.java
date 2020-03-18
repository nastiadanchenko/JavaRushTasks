package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int rdr = Integer.parseInt(reader.readLine());
        List<Integer> list = new ArrayList<>();
        int j = 1;
        int k = 1;
        for (int i = 1; i <5 ; i++) {
            list.add(rdr);
            if (list.get(i).equals(list.get(i-1))) {j++;
            } else if (k<j) {k=j; j=1;}
            System.out.println(k);
        }
    }
}