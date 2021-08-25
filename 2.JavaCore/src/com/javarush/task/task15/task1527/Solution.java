package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        //напишите тут ваш код
        String paramSubString = url.substring(url.lastIndexOf("?") + 1);
        String[] arrayParam = paramSubString.split("&");

        StringBuilder stringBuilder = new StringBuilder();

        String valStr = null;
        double val = 0.0;
        for (String s : arrayParam
        ) {
            if (s.contains("=")) {
                String tmp = s.substring(0, s.indexOf('='));
                stringBuilder.append(tmp);
                stringBuilder.append(" ");
                if (s.startsWith("obj"))
                    try {
                        String valOjc = s.substring(s.lastIndexOf("=") + 1);
                        val = Double.parseDouble(valOjc);
                    } catch (NumberFormatException e) {
                        valStr = s.substring(s.lastIndexOf("=") + 1);
                    }
            } else {
                stringBuilder.append(s);
                stringBuilder.append(" ");
            }
        }
        System.out.println(stringBuilder.toString());
        if (val != 0.0) alert(val);
        else if (valStr != null) alert(valStr);
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
