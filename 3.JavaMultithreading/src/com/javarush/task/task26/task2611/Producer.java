package com.javarush.task.task26.task2611;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by User on 03.09.2020.
 */
public class Producer implements Runnable {
    private ConcurrentHashMap<String, String> map;

    public Producer(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }

    @Override
    public void run() {
        try {
            int i = 1;
            while (true) {
                map.put(Integer.toString(i), "Some text for " + i++);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.printf("[%s] thread was terminated",Thread.currentThread().getName());
        }
    }
}
