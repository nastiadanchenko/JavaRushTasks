package task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Иванов", 100);
        map.put("Петров", 278);
        map.put("Сидоров", 350);
        map.put("Надеин", 15000);
        map.put("Харламова", 3900);
        map.put("Проскуряков", 499);
        map.put("Микрухин", 5000);
        map.put("Ярцев", 3500);
        map.put("Корнюшина", 4000);
        map.put("Бесламбеков", 300);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        map.entrySet().removeIf(pair -> pair.getValue() < 500);
    }

    public static void main(String[] args) {

    }
}