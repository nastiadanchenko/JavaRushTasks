package com.javarush.task.task15.task1529;

/* 
Осваивание статического блока
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static CanFly result;

    public static void reset() {
        //add your code here - добавьте код тут
        try (  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String string = reader.readLine();
            if (string.equals("helicopter")){
                result = new Helicopter();
            }if (string.equals("plane")){
                System.out.println("How many passengers?");
                int countPassengers = Integer.parseInt(reader.readLine());
                result = new Plane(countPassengers);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
