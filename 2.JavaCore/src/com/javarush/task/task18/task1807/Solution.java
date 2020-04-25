package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine())) {
            byte[] buffer;
            buffer = new byte[inputStream.available()];
            inputStream.read(buffer, 0, inputStream.available());
            int count = 0;
            for (int i = 0; i < buffer.length; i++) {
                if (buffer[i] == 44) count++;

            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
