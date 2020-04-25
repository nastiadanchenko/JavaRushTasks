package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream1=new FileInputStream(reader.readLine());
             FileOutputStream outputStream2 = new FileOutputStream(reader.readLine())
             ){
            ArrayList<Integer>list = new ArrayList<>();
            while (inputStream1.available()>0) {
                int count = inputStream1.read();
                list.add(0,count);
            }
                for (int i =0; i <list.size(); i++) {
                    outputStream2.write(list.get(i));
                }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
