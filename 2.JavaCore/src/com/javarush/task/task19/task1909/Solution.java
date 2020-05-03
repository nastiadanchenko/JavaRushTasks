package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(reader.readLine()))) {
            StringBuilder stringBuilder =new StringBuilder();
            while (bufferedReader.ready()){
                stringBuilder.append((char) bufferedReader.read());

            }
            String stringArray = new String(stringBuilder).replace('.','!');
            bufferedWriter.write(stringArray);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
