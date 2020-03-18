package com.javarush.task.task06.task0610;

/* 
Класс ConsoleReader
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.prefs.BackingStoreException;

public class ConsoleReader {
    public static String readString() throws Exception {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        return string;
    }

    public static int readInt() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int volue = scanner.nextInt();
        return volue;
    }

    public static double readDouble() throws Exception {
       Scanner scanner = new Scanner(System.in);
        double volueDouble = scanner.nextDouble();
        return volueDouble;
    }

    public static boolean readBoolean() throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean trueFalse = scanner.nextBoolean();
        return trueFalse;
    }

    public static void main(String[] args) throws Exception {

    }
}
