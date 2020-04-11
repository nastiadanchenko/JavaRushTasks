package com.javarush.task.task15.task1518;

/* 
Статики и котики
*/

public class Solution {
    public static class Cat{
        public String name;
    }
    public static Cat cat;
static {
    Cat cat1 = new Cat();
    cat = cat1;
    cat1.name = "Какой-то кот";
    System.out.println(cat1.name);
}
    public static void main(String[] args) {

    }
}
