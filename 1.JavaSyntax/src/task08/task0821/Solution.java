package task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Ваня");
        map.put("Петров", "Петя");
        map.put("Сидоров", "Ваня");
        map.put("Иванов", "Кирилл");
        map.put("Харламова", "Сергей");
        map.put("Петров", "Илья");
        map.put("Микрухин", "Саша");
        map.put("Ярцев", "Илья");
        map.put("Корнюшина", "Света");
        map.put("Бесламбеков", "Тимур");
        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
