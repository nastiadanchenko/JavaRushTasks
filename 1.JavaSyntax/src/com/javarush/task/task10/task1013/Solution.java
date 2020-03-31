package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private char sex;
        private String address;
        private boolean haveJob;
        private double height;

        public Human() {
        }

        public Human(String name, int age, char sex, String address, boolean haveJob, double height) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.address = address;
            this.haveJob = haveJob;
            this.height = height;
        }

        public Human(String name, int age, char sex, double height, String address) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.address = address;
            this.height = height;
        }

        public Human(String name, int age, char sex, double height) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.height = height;
        }

        public Human(String name, int age, char sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, char sex){
            this.name = name;
            this.sex = sex;
        }

        public Human(char sex, double height){
            this.sex = sex;
            this.height = height;
        }

        public Human(String address, boolean haveJob){
            this.address = address;
            this.haveJob = haveJob;
        }

    }
}
