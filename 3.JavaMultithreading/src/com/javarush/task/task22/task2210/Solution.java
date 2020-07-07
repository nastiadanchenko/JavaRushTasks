package com.javarush.task.task22.task2210;

import java.util.*;

import static java.util.Arrays.*;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {

        String[] strings = getTokens("level22.lesson13.task01", ".");
        System.out.println(Arrays.toString(strings));

    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        List<String> list = new ArrayList<>();

        while (stringTokenizer.hasMoreTokens()){
            list.addAll(Arrays.asList(stringTokenizer.nextToken())) ;
        }
        String[] result = list.toArray(new String[list.size()]);
        return result;
    }
}
