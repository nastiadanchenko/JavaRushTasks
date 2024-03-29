package com.javarush.task.task27.task2705;

/* 
Второй вариант deadlock
*/
public class Solution {
    private final Object lock = new Object();

    public synchronized void firstMethod() {
        synchronized (lock) {
            System.out.println("firstMethod");
            doSomething();

        }
    }

    public void secondMethod() {
        synchronized (lock) {
            synchronized (this) {
                System.out.println("secondMethod");
                doSomething();
            }
        }
    }

    private void doSomething() {
        System.out.println("doSomething");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution solution1 = new Solution();
        new Thread(new Runnable() {
            @Override
            public void run() {
                solution.firstMethod();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                solution.secondMethod();

            }
        }).start();
    }
}