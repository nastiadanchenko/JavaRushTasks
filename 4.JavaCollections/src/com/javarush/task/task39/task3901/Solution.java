package com.javarush.task.task39.task3901;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Уникальные подстроки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your string: ");
        String s = bufferedReader.readLine();

        System.out.println("The longest unique substring length is: \n" + lengthOfLongestUniqueSubstring(s));
    }

    public static int lengthOfLongestUniqueSubstring(String s) {
        if (s==null) return 0;
        Set<Character> characters = new HashSet<>();
        int maxLength = 0;

        for (int i = 0; i <s.length() ; i++) {
            if (characters.size() > maxLength) {
                maxLength = characters.size();
            }
            characters.clear();

            for (int j = i; j <s.length() ; j++) {
                if (!characters.add(s.charAt(j))) {
                    break;
                }
            } 
        }
        return Math.max(characters.size(), maxLength);
       /*return new StringBuilder(
                new StringBuilder(s)
                        .reverse()
                        .toString()
                        .replaceAll("(.)(?=.*\\1)", ""))
                .reverse().toString().replaceAll("[1-9]","").length();
*/

    }
}
