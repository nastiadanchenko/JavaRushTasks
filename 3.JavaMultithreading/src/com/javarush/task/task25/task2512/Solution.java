package com.javarush.task.task25.task2512;

import java.util.*;

/* 
Живем своим умом
*/
public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        t.interrupt();
        List<Throwable> list = new ArrayList<>();
        while (e!=null){
            list.add(e);
            e = e.getCause();
        }
        Collections.reverse(list);
        for (Throwable th:list
             ) {
            System.out.println(th);
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Thread thread = new Thread();
        solution.uncaughtException(thread,new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI"))));
    }
}
