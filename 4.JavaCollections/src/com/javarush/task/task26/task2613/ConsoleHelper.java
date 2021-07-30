package com.javarush.task.task26.task2613;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    private static BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() {
        try {
          String  str = bis.readLine();
            return str;
        } catch (IOException e) {
        }
        return null;
    }

    public static String askCurrencyCode() {
       
        while (true) {
            writeMessage("Введите код валюты");
           String val = readString();
            if (val == null || val.trim().length()!=3) {
                writeMessage("Данные не корректны");
                continue;
            }
            return val.trim().toUpperCase();
        }
    }

    public static String[] getValidTwoDigits(String currencyCode) {
        while (true) {
            writeMessage("Bведите два целых положительных числа.\n" +
                    "Первое число - номинал, второе - количество банкнот");
            String s = readString();
            String[] strArray = null;
            if (s == null || (strArray = s.split(" ")).length != 2) {
                writeMessage("Пожалуйста, введите корректные данные");
            }else {
                try {
                    if (Integer.parseInt(strArray[0]) <= 0 || Integer.parseInt(strArray[1]) <= 0)
                        writeMessage("Пожалуйста, введите корректные данные");
                } catch (NumberFormatException e) {
                    writeMessage("Пожалуйста, введите корректные данные");
                    continue;
                }
                return strArray;
            }
        }
    }

}
