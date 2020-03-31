package com.javarush.task.task10.task1019;

/* 
Функциональности маловато!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        while (true) {
            String sr = reader.readLine();
            if(sr.isEmpty())
                break;
            int id = Integer.parseInt(sr);
            String name = reader.readLine();
            if(name.isEmpty()){
                map.put("", id);
                break;
            }
            map.put(name, id);
        }
        for (Map.Entry<String, Integer> pair : map.entrySet()
                ) {
            String kay = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(value + " " + kay);
        }

    }
}
