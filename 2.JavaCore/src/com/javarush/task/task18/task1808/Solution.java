package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream1=new FileInputStream(reader.readLine());
             FileOutputStream outputStream2 = new FileOutputStream(reader.readLine());
        FileOutputStream outputStream3 = new FileOutputStream(reader.readLine())){

            byte[] buffer = new byte[inputStream1.available()];

            if (inputStream1.available()%2==0){
                int count = inputStream1.read(buffer);
                outputStream2.write(buffer,0,count/2);
                outputStream3.write(buffer,count/2,count/2);
            }else  if(inputStream1.available()%2!=0){
                int count = inputStream1.read(buffer);
                outputStream2.write(buffer,0,count/2+1);
                outputStream3.write(buffer,count/2+1,count/2);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
