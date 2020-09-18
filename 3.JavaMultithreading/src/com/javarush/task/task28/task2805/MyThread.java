package com.javarush.task.task28.task2805;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by User on 15.09.2020.
 */
public class MyThread extends Thread {
    public static AtomicInteger count = new AtomicInteger(1);
    public MyThread() {
        init();
    }

    private void init() {
        if (count.get() < 10) setPriority(count.getAndIncrement());
        else {
            setPriority(count.get());
            count.set(1);
        }
    }


    public MyThread(Runnable target) {
        super(target);
        init();
    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
        init();
    }

    public MyThread(String name) {
        super(name);
        init();
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
        init();
    }

    public MyThread(Runnable target, String name) {
        super(target, name);
        init();
    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
        init();
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
       init();
    }
}
