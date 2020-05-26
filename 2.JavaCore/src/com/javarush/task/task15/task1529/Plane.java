package com.javarush.task.task15.task1529;

/**
 * Created by User on 26.05.2020.
 */
public class Plane implements CanFly {
    private int passengers;
    public Plane(int passengers){
        this.passengers = passengers;
        fly();
    }
    @Override
    public void fly() {
        System.out.println("Plane is flying with "+passengers+" passengers");
    }
}
