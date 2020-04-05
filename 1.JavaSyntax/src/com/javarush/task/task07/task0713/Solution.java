package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listForThree = new ArrayList<>();
        ArrayList<Integer> listForTow = new ArrayList<>();
        ArrayList<Integer> listAnother = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0) {
                listForThree.add(list.get(i));
            }
            if (list.get(i) % 2 == 0) {
                listForTow.add(list.get(i));
            } else if (list.get(i) % 3 != 0 && list.get(i) % 2 != 0)
                listAnother.add(list.get(i));
        }

        printList(listForThree);
        printList(listForTow);
        printList(listAnother);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer text : list
                ) {
            System.out.println(text);
        }

    }
}
