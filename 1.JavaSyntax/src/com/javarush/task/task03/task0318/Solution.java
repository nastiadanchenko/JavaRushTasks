package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
//        InputStream inputStream = System.in;
//        Reader inputStreamReader = new InputStreamReader(inputStream);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sAge = reader.readLine(); //читаем строку с клавиатуры
        int nAge = Integer.parseInt(sAge);//напишите тут ваш код
        String name = reader.readLine(); //читаем строку с клавиатуры
        System.out.print(name + " захватит мир через " + nAge + " лет. Му-ха-ха!");



    }
}
