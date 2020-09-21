package com.javarush.task.task19.task1923;

import java.io.*;
import java.util.ArrayList;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0])) ;
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))){
           while (reader.ready()){
               String string = reader.readLine();
               String[] strings = string.split(" ");
               for (String world:strings
                       ) {
                   if (world.matches("(.*[0-9]+.*)")) {
                       writer.write(world+" ");
                   }
               }
           }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
