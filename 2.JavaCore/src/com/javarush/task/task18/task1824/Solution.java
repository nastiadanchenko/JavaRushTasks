package com.javarush.task.task18.task1824;

import java.io.*;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) {
        String fileName = null;
        while (true) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                fileName = reader.readLine();
                FileInputStream ips = new FileInputStream(fileName);
                ips.close();
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
