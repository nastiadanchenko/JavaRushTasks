package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public static void main(String[] args) {

    }

    public class Cat implements CanRun,CanClimb{
        public void run(){
            System.out.println("cat run");
        }
        public void climb(){
            System.out.println("cat climb");
        }
    }

    public class Dog implements CanRun{
        public void run(){
            System.out.println("dog run ");
        }
    }

    public class Tiger extends Cat {
    }

    public class Duck implements CanRun, CanFly{
        public void fly(){
            System.out.println("duck fly");
        }
        public void run(){
            System.out.println("duck run");
        }
    }
    public interface CanFly{
        public void fly();
    }
    public interface CanClimb{
        public void climb();
    }
    public interface CanRun{
        public void run();
    }
}
