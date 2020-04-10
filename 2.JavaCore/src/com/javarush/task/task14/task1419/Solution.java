package com.javarush.task.task14.task1419;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception

        exceptions.add(new Exception());
        exceptions.add(new NoSuchFieldException());
        exceptions.add(new SocketException());
        exceptions.add(new IOException());
        exceptions.add(new RuntimeException());
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int arry[] = {1, 2, 3};
            System.out.println(arry[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            ArrayList<String> list = new ArrayList<>();
            System.out.println(list.get(2));
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            int a = Integer.parseInt(null);
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }
        try {
            File f = new File("C://file.txt");
            FileReader fr = new FileReader(f);
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }


        //напишите тут ваш код

    }
}
