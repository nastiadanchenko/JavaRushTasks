package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sr = 0;
        int d = 0;
        double r =0;

        while (true) {
            int number = Integer.parseInt(reader.readLine());
            if (number ==-1){
                System.out.println(r);
                break;
            }else {
                d++;
                sr +=number;
                r = sr/d;
            }

        }
    }
}

