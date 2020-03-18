package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextDouble();
        double t1 = t%5;

        if (t1<3) System.out.println("зелёный");
        if (t1<4 && t1>=3) System.out.println("жёлтый");
        if(t1<5 && t1>=4) System.out.println("красный");



    }
}