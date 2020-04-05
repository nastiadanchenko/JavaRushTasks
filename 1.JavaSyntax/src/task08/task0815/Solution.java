package task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i <10; i++) {
            map.put(i+"LastName", i + "FirstName");
        }
        return map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int value=0;
        for (Map.Entry<String,String> entry: map.entrySet()
             ) {
            if(entry.getValue().equals(name)) value++;
        }
        return value;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int value=0;
        for (Map.Entry<String,String> entry: map.entrySet()
                ) {
            if(entry.getKey().equals(lastName)) value++;
        }
        return value;


    }

    public static void main(String[] args) {

    }
}
