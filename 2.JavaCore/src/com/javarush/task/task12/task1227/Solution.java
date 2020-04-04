package com.javarush.task.task12.task1227;

/* 
CanFly, CanRun, CanSwim для классов Duck, Penguin, Toad
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }

    public class Duck implements CanFly, CanSwim, CanRun{
        public void fly(){
            System.out.println("duck fly");

        }
        public void swim(){
            System.out.println("duck swim");
        }
        public void run(){
            System.out.println("duck run");
        }

    }

    public class Penguin implements CanRun, CanSwim{
        public void swim(){
            System.out.println("penguin swim");
        }
        public void run(){
            System.out.println("penguin run");
        }

    }

    public class Toad implements CanSwim{
        public void swim(){
            System.out.println("toad swim");
        }

    }
}
