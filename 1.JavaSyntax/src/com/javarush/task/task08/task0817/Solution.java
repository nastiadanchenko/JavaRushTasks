package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Путин", "Владимир");
        map.put("Пупкин", "Андрей");
        map.put("Фурсенко ", "Сергей");
        map.put("Якунин", "Владимир");
        map.put("Медведев ", "Дмитрий");
        map.put("Шамалов", "Николай");
        map.put("Чубайс", "Анатолий");
        map.put("Смирнов", "Владимир");
        map.put("Ковальчук", "Юрий");
        map.put("Мячин", "Виктор");
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> list = new ArrayList<>(map.values());
        Collections.sort(list);
        for (int i = 0; i <list.size()-1 ; i++) {
            if (list.get(i).equals(list.get(i+1)))
                removeItemFromMapByValue(map,list.get(i));
        }


    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {


    }
}
