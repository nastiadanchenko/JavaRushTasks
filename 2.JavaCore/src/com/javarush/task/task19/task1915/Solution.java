package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))
        ) {
            FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine());
            PrintStream concole = System.out;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(byteArrayOutputStream);
            System.setOut(printStream);

            testString.printSomething();
            String result = byteArrayOutputStream.toString();
            System.setOut(concole);
            fileOutputStream.write(byteArrayOutputStream.toByteArray());
            System.out.println(result);
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

