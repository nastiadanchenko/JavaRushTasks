package task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Монро", dateFormat.parse("AUGUST 5 1962"));
        map.put("Росляков", dateFormat.parse("MAY 29 1988"));
        map.put("Петров", dateFormat.parse("JUN 15 1975"));
        map.put("Иванов", dateFormat.parse("JULY 24 1969"));
        map.put("Данченко", dateFormat.parse("OCTOBER 11 1993"));
        map.put("Энди Гарсиа", dateFormat.parse("APR 12 1956"));
        map.put("Лэнс Хенриксен", dateFormat.parse("MAY 5 1940"));
        map.put("Эсекьель Гарай", dateFormat.parse("OCT 10 1986"));
        map.put("Кэтрин Лэнгфорд", dateFormat.parse("APR 29 1996"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        map.entrySet().removeIf(pair -> pair.getValue().getMonth() == Calendar.JUNE);
        map.entrySet().removeIf(pair -> pair.getValue().getMonth() == Calendar.JULY);
        map.entrySet().removeIf(pair -> pair.getValue().getMonth() == Calendar.AUGUST);

    }

    public static void main(String[] args) {


    }
}
