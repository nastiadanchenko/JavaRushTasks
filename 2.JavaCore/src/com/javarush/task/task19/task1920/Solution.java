package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String filname = "C:\\Users\\User\\Desktop\\test.txt";
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String,Double> map = new TreeMap<>();

        while (reader.ready()){
            String[] strings = reader.readLine().split(" ");
            if (map.containsKey(strings[0])){
                map.put(strings[0], map.get(strings[0]) + Double.parseDouble(strings[1]));
            } else map.put(strings[0], Double.parseDouble(strings[1]));
        }
        Double maxValue = Collections.max(map.values());
        for (Map.Entry<String,Double> entry:map.entrySet()
             ) {if (entry.getValue().equals(maxValue)){
            System.out.println(entry.getKey());
        }
        }
        reader.close();
    }
}
