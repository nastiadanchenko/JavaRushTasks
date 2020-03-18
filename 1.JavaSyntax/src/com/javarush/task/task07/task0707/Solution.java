package com.javarush.task.task07.task0707;

/* 
Что за список такой?
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        String string1 = "Mama";
        String string2 = "Dad";
        String string3 = "Sister";
        String string4 = "Brother";
        String string5 = "Family";
        list.add(string1);
        list.add(string2);
        list.add(string3);
        list.add(string4);
        list.add(string5);
        System.out.println(list.size());
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
