package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fileName = new FileWriter(reader.readLine());
             BufferedWriter writer = new BufferedWriter(fileName)) {

        while (true) {
            String line = reader.readLine();
            if (line.equals("exit")) {
                writer.write(line);
                break;
            } else {
                writer.write(line);
                writer.newLine();
            }
        }
    }
}
}
