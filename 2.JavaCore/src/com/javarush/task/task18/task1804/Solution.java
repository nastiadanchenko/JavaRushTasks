package com.javarush.task.task18.task1804;

/* 
Самые редкие байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(reader.readLine())){
            List<Integer> list = new ArrayList<>();
            Map<Integer, Integer> map = new HashMap<>();
            while (inputStream.available()>0){
                int data = inputStream.read();
                list.add(data);
            }
            int count =0;
            int min = list.size();
            int index = 0;
            for (int i = list.size()-1; i !=-1 ; i--) {
                for (int j = list.size()-1; j !=-1 ; j--) {
                    if (list.get(i)==list.get(j)) {
                        count++;
                    }
                }

            if (count<=min){
                min = count;
                index = list.get(i);
                map.putIfAbsent(index, count);
            }
                count = 0;
        }
            for (Map.Entry<Integer,Integer> pair:map.entrySet()
                 ) {
                if (pair.getValue() ==min) System.out.print(pair.getKey()+" ");
            }
        }
    }
}
