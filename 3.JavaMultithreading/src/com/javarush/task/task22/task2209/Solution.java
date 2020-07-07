package com.javarush.task.task22.task2209;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader(reader.readLine()))){
            List<String> strings = new ArrayList<>();
            // читаем фаил
            while (br.ready()) {
                // загружаем в список слова построчно через Arrays.asList() и делим слова по поробелам split(" ")
                strings.addAll(Arrays.asList(br.readLine().split("\\s+")));

            }
           // System.out.println(strings);
            // В getLine передаем массив строк (переводим список строк strings в масссив, с помощью toArray()  )
            StringBuilder result = getLine(strings.toArray(new String[strings.size()]));
            System.out.println(result.toString());
            
        } catch (IOException e) {
            e.printStackTrace();
        }

       
    }

    public static StringBuilder getLine(String... words) {
        if (words==null||words.length==0) return new StringBuilder();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        sb.append(words[0]);

                for (int j = 1; j < words.length; j++) {
                    /*sb.append(words[j]);
                    System.out.println(words[j]);

                    String s = sb.delete(0,words[j].length()-1).toString().toLowerCase();
                    System.out.println( "s " +s);
*/
                    for (int k = 1; k <words.length ; k++) {
                        String word = words[k];
                        //System.out.println(word.toLowerCase().charAt(0));
                        if (word!=null&& word.toLowerCase().charAt(0)==sb.charAt(sb.length()-1)){
                            sb.append(" "+word);
                            words[k] = null;

                            //System.out.println(sb.toString());
                        } else if (word != null && word.toUpperCase().charAt(word.length() - 1) == sb.charAt(0)) {
                            sb.insert(0, word + " ");
                        }
                        /*String st = words[k].toLowerCase().substring(0,1);
                        System.out.println("st "+st);

                        if (s.equals(st)){
                            sb.append(words[k] + " ");
                            sb.append(" ");
                            count++;
                            System.out.println(sb.toString());

                            if (count==words.length)break;
                        }*/
                    }

                }
                //System.out.println(sb.toString());

         return sb;
    }
}
