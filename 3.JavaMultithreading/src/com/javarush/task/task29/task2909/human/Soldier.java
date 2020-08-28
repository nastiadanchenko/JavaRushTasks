package com.javarush.task.task29.task2909.human;

/**
 * Created by User on 27.08.2020.
 */
public class Soldier extends Human {
    private boolean isSoldier;
    public Soldier(String name, int age) {
        super(name, age);
    }

    public void live() {
       // if (isSoldier)
            fight();
    }

    public  void fight() {
    }
}
