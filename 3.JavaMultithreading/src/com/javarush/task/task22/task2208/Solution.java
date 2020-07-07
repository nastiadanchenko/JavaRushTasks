package com.javarush.task.task22.task2208;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        Map<String, String> params1 = new HashMap<>();
        params1.put("name","Ivanov");
        params1.put("country","Ukraine");
        params1.put("city","Kiev");
        params1.put("age",null);
        System.out.println(getQuery(params1));
        Map<String, String> params2 = new HashMap<>();
        params2.put(null, null);
        System.out.println(getQuery(params2));
    }

    public static String getQuery(Map<String, String> params) {
        if (Collections.frequency(params.values(), null) == params.size()) return ""; // Проверка на ноль всех значений map
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> pair:params.entrySet()
             ) {
            if (pair.getValue()!=null){
                stringBuilder.append(String.format("%s = '%s' and ",pair.getKey(),pair.getValue()));

            }
        }
        stringBuilder.delete(stringBuilder.length() - 5, stringBuilder.length()); // удаляем последний and в строке
        return stringBuilder.toString();
    }
}
