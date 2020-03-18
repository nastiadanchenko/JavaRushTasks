package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();
        int n = scanner.nextInt();
        int a = 1;
        if (n > 0) {
            while (a <= n) {
                System.out.println(N);
                a++;
            }
        }
    }
}

