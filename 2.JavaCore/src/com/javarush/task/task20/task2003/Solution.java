package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {

    public static Map<String, String> runtimeStorage = new HashMap<>();
    private static Properties prop = new Properties();

    public void fillInPropertiesMap() throws Exception {
        //implement this method - реализуйте этот метод
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileInputStream fileInProp = new FileInputStream(fileName);
        load(fileInProp);
        fileInProp.close();
    }


    public static void save(OutputStream outputStream) throws Exception {
        //напишите тут ваш код
        prop.clear();
        for (Map.Entry<String, String> entry : runtimeStorage.entrySet()) {
            prop.setProperty(entry.getKey(), entry.getValue());
        }
        prop.store(outputStream, "");

    }

    public static void load(InputStream inputStream) throws IOException {
        //напишите тут ваш код
        runtimeStorage.clear();
        prop.clear();
        prop.load(inputStream);
        for (String pn : prop.stringPropertyNames()) {
            runtimeStorage.put(pn, prop.getProperty(pn));
        }

    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream(reader.readLine())) {
            load(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}
