package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));// выполняем условие "В метод main первым параметром приходит имя файла."
            TreeMap<String, Double> map = new TreeMap<>(); // карта с автоматической естественной сортировкой

            while (reader.ready()){ // читаем фаил пока вем что-то есть
            String[] strings = reader.readLine().split(" "); // читаем по строчно и удаляем пробелы
            if(map.containsKey(strings[0])){ // проверяем наличие ключа
                map.put(strings[0], map.get(strings[0]) + Double.parseDouble(strings[1]));// добавляем в map ключ и прибавляем значение совпавших ключей
            } else map.put(strings[0], Double.parseDouble(strings[1]));
            }
            for (Map.Entry<String,Double> entry:map.entrySet()
                 ) {
                System.out.println(entry.getKey()+" "+ entry.getValue());
            }
            reader.close();


    }
}
