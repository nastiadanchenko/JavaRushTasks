package com.javarush.task.task39.task3909;

/* 
Одно изменение
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static boolean isOneEditAway(String first, String second) {
        char[] charsFirstString = first.toCharArray();
        char[] charsSecondString = second.toCharArray();
        int lengthDifference = first.length() - second.length();
        int countUnequals = 0;
        if (lengthDifference == 0) {
            for (int i = 0; i < first.length(); i++) {
                if (charsFirstString[i] != charsSecondString[i]) {
                    countUnequals++;
                }
            }
            return countUnequals < 2;

        } else if (lengthDifference == 1) {
            return checkInsertion(first, second);
        } else if (lengthDifference == -1) {
            return checkInsertion(second, first);
        }
        return false;
    }

    private static boolean checkInsertion(String first, String second) {
        int i = 0;
        int j = 0;

        while (j < second.length() && i < first.length()) {
            if (first.charAt(i) != second.charAt(j)) {
                if (i != j) {
                    return false;
                }
                i++;
            } else {
                i++;
                j++;
            }
        }
        return true;
    }

}
