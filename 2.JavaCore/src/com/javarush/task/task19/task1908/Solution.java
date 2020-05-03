package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(reader.readLine()));

            /*StringBuilder stringBuilder= new StringBuilder();
            while (bufferedReader.ready()){
                stringBuilder.append((char) bufferedReader.read());
            }
            String[] stringArray = new String(stringBuilder).split("(\\b)[0-9]+(\\s|\\b)");
            for (String s: stringArray
                 ) {
                bufferedWriter.write(s+ " ");
            }*/

            String str = "";
            while ((str = bufferedReader.readLine())!= null){
                Pattern p = Pattern.compile("(\\b)[0-9]+(\\s|\\b)");
                Matcher m = p.matcher(str);
                while (m.find()){
                    bufferedWriter.write(str.substring(m.start(), m.end()));
                }
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
