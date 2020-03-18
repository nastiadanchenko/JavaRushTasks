package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int resultAge = Integer.compare(this.age,anotherCat.age);
        int resultWeight = Integer.compare(this.weight,anotherCat.weight);
        int resultStrength = Integer.compare(this.strength,anotherCat.strength);


        int battle = resultAge+resultWeight+resultStrength;
        return battle>0;

    }

    public static void main(String[] args) {

    }
}
