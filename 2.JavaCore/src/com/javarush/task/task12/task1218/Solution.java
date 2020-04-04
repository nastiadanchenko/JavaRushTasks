package com.javarush.task.task12.task1218;

/* 
Есть, летать и двигаться
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanMove,CanEat{
        public void move() {
            System.out.println("I can move");
        }
        public void eat(){
            System.out.println("I can eat");
        }
    }

    public class Duck implements CanMove,CanFly,CanEat {
        public void move() {
            System.out.println("I can move");
        }
        public void eat(){
            System.out.println("I can eat");
        }
        public void fly() {
            System.out.println("I can fly");
        }
    }

    public class Car implements CanMove{
        public void move() {
            System.out.println("I can move");
        }
    }

    public class Airplane implements CanMove, CanFly {
        public void move() {
            System.out.println("I can move");
        }
        public void fly() {
            System.out.println("I can fly");
        }
    }
}
