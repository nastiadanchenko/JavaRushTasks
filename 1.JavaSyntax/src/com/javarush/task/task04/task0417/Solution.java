package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
       // System.out.println("Введите три числа.");
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();

        if (x1 == x2 & x1!=x3) {
            System.out.println(x1 + " " + x2);
        } else if (x1 == x3 & x1 != x2) {
            System.out.println(x1 + " " + x3);
        } else if (x2 == x3 & x2!=x1) {
                System.out.println(x2 + " " + x3);
        } else if (x1 == x2 & x2 == x3) {
                    System.out.println(x1 + " " + x2 + " " + x3);
                }


            }
        }


