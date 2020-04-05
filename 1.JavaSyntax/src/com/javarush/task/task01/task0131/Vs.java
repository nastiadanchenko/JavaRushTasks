package com.javarush.task.task01.task0131;

public class Vs {
    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(660));
    }
    public static int getMetreFromCentimetre(int centemetre) {
        int metre = centemetre / 100;
        return metre;
    }
}
