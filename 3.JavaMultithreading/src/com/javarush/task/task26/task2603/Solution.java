package com.javarush.task.task26.task2603;

import java.util.Arrays;
import java.util.Comparator;

/* 
Убежденному убеждать других не трудно
*/
public class Solution {
    public static class CustomizedComparator<T> implements Comparator<T>{
        private Comparator<T>[] comparators;

        public CustomizedComparator(Comparator<T> ... comparators) {
            this.comparators = comparators;

        }

        @Override
        public int compare(T o1, T o2) {
            int redult = 0;
            for (Comparator c:comparators
                 ) {
                redult =c.compare(o1,o2) ;
                if (redult!=0)break;
            }
            return redult;
        }
    }
    public static void main(String[] args) {

    }
}
