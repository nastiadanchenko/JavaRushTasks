package com.javarush.task.task15.task1522;

/* 
Закрепляем паттерн Singleton
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;

public class Solution {
    static {
        readKeyFromConsoleAndInitPlanet();
    }
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        try ( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String string = reader.readLine();

            if (string.equals("sun")) {thePlanet = Sun.getInstance();
                System.out.println("thePlanet = Sun");}
            else if (string.equals("moon")) {thePlanet = Moon.getInstance();
                System.out.println("thePlanet = Moon");}
            else if (string.equals("earth")) {thePlanet = Earth.getInstance();
                System.out.println("thePlanet = Earth");}
            else { thePlanet = null;
                System.out.println("thePlanet = null");}
        } catch (Exception e) {

        }
    }
}
