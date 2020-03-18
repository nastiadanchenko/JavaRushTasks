package com.javarush.task.task04.task0443;

/* 
Как назвали, так назвали
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scannerName = new Scanner(System.in);
        Scanner scannerYear = new Scanner(System.in);
        Scanner scannerMonth = new Scanner(System.in);
        Scanner scannerDate = new Scanner(System.in);
        String name = scannerName.nextLine();
        int y = scannerYear.nextInt();
        int m = scannerMonth.nextInt();
        int d = scannerDate.nextInt();
        System.out.println("Меня зовут "+name+".");
        System.out.println("Я родился "+d+"."+m+"."+y);

    }
}
