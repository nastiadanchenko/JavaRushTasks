package com.javarush.task.task29.task2909.car;

/**
 * Created by User on 28.08.2020.
 */
public class Truck extends Car{
    public Truck(int type, int numberOfPassengers) {
        super(type, numberOfPassengers);
    }
    public Truck( int numberOfPassengers) {
        super(0, numberOfPassengers);
    }

    @Override
    public int getMaxSpeed() {
        return MAX_TRUCK_SPEED;
    }
}
