package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();
        String result = outputStream.toString();
        String[] arrya = result.split(" ");
        int a = Integer.parseInt(arrya[0]);
        int b = Integer.parseInt(arrya[2]);
        int s = 0;
        if (arrya[1].equals("+")) {
            s = a + b;
        }
        if (arrya[1].equals("-")) {
            s = a - b;
        }
        if (arrya[1].equals("*")) {
            s = a * b;
        }

        System.setOut(console);
        System.out.println(result+s);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

