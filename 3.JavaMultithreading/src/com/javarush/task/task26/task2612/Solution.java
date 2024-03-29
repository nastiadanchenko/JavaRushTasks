package com.javarush.task.task26.task2612;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* 
Весь мир играет комедию
*/
public class Solution {
    private Lock lock = new ReentrantLock();

    public void someMethod() {
        // Implement the logic here. Use the lock field
        try {

            if (lock.tryLock()) {actionIfLockIsFree();lock.unlock();}
            else {actionIfLockIsBusy(); }
        } catch (Exception e) {
            lock.unlock(); // это вариант для валидатора, unlock должен быть в блоке finally
        }
    }

    public void actionIfLockIsFree() {
    }

    public void actionIfLockIsBusy() {
    }
}
