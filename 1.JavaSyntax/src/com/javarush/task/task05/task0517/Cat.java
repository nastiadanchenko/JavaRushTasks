package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    private String name = null;
    private int weight = 4;
    private String color = "black";
    private String address = null;
    private int age = 3;

    public Cat(String name) {
        this.name = name;
        this.weight =4;
        this.color = "black";
        this.age = 3;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "black";
    }
    public Cat(String name, int age) {
        this.name = name;
        this.weight = 4;
        this.age = age;
        this.color = "black";
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 3;
    }
    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 3;
    }


    public static void main(String[] args) {

    }
}
