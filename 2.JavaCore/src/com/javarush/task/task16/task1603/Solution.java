package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread sT1 = new SpecialThread();
        Thread thread1 = new Thread(sT1);
        SpecialThread sT2 = new SpecialThread();
        Thread thread2 = new Thread(sT2);
        SpecialThread sT3 = new SpecialThread();
        Thread thread3 = new Thread(sT3);
        SpecialThread sT4 = new SpecialThread();
        Thread thread4 = new Thread(sT4);
        SpecialThread sT5 = new SpecialThread();
        Thread thread5 = new Thread(sT5);
        list.add(thread1);
        list.add(thread2);
        list.add(thread3);
        list.add(thread4);
        list.add(thread5);
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
