package com.javarush.task.task18.task1803;

/* 
Самые частые байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        try (FileInputStream inputStream = new FileInputStream(string)) {
            long[] longs = new long[256];
            while (inputStream.available()>0){
                longs[inputStream.read()]++;
            }
            long madRepeat = 0;
            for (int i = 0; i <longs.length ; i++) {
                if(longs[i]>madRepeat){
                    madRepeat = longs[i];
                }
            }
            for (int i = 0; i <longs.length ; i++) {
                if (longs[i]==madRepeat){
                    System.out.print(i+" ");
                }
            }

            }




    }
}
