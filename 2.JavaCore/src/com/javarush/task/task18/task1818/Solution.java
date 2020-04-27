package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        try ( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
              FileOutputStream outputStream1 = new FileOutputStream(reader.readLine(), true);
              FileInputStream inputStream2 = new FileInputStream(reader.readLine());
              FileInputStream inputStream3 = new FileInputStream(reader.readLine())){
            int i;
            while ((i = inputStream2.read())!=-1){
                outputStream1.write(i);
            }
            while ((i=inputStream3.read())!=-1){
                outputStream1.write(i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
