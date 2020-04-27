package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(reader.readLine());
             FileOutputStream outputStream = new FileOutputStream(reader.readLine())
        ) {
            StringBuilder stringBuilder = new StringBuilder();
            Scanner scanner = new Scanner(inputStream);
            int i;
            while (scanner.hasNext()) {
                String string = scanner.next();
                double count = Double.parseDouble(string);
                if (count>0) stringBuilder.append(Math.round(count)).append(" ");
                else stringBuilder.append(Math.round(count)).append(" ");
            }
            Writer writer = new BufferedWriter(new OutputStreamWriter(outputStream, "utf-8"));
            String result = stringBuilder.toString();
            writer.write(result);
            writer.close();
            scanner.close();

        }
    }
}
