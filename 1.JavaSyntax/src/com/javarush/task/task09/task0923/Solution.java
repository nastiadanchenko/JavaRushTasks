package com.javarush.task.task09.task0923;

/* 
Гласные и согласные
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader stringBuffer = new BufferedReader(new InputStreamReader(System.in));
        String string = stringBuffer.readLine();
        char[] chars = string.toCharArray();


        StringBuffer vowel = new StringBuffer();
        StringBuffer other = new StringBuffer();

        for (int i = 0; i <chars.length ; i++) {
            if(isVowel(chars[i])){
                vowel.append(chars[i] + " ");
            }else if (!isVowel(chars[i])&&chars[i]==' '){
                continue;
            }else {
                other.append(chars[i] + " ");
            }

        }
        System.out.println(vowel);
        System.out.println(other);
        }


    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}