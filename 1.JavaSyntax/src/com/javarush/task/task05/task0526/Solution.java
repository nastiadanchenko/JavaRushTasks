package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man vasya = new Man("Вася", 35, "Челябинск");
        Man petya = new Man("Петя", 47, "Челябинск");
        Woman sveta = new Woman("Света", 27, "Тула");
        Woman anna = new Woman("Аня", 15, "Тула");
        System.out.println(sveta.name + " " + sveta.age + " " + sveta.address);
        System.out.println(vasya.name + " " + vasya.age + " " + vasya.address);
        System.out.println(anna.name + " " + anna.age + " " + anna.address);
        System.out.println(petya.name+" "+petya.age+" "+petya.address);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }


    }
     public static class Woman{
         String name;
         int age;
         String address;
         public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
