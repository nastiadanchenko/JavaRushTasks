package com.javarush.task.task38.task3803;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Runtime исключения (unchecked exception)
*/

public class VeryComplexClass {
    public void methodThrowsClassCastException() throws ClassCastException{
        Object x = new Integer(0);
        System.out.println((String)x);
    }

    public void methodThrowsNullPointerException() {
        Integer str = null;
        System.out.println(str.toString());
    }

    public static void main(String[] args) {

    }
}
