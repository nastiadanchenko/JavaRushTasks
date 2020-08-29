package com.javarush.task.task29.task2909.car;

/**
 * Created by User on 28.08.2020.
 */
public class Cabriolet extends Car {
    public Cabriolet(int type, int numberOfPassengers) {
        super(type, numberOfPassengers);
    }

    @Override
    public int getMaxSpeed() {
        return MAX_CABRIOLET_SPEED;
    }

    public Cabriolet( int numberOfPassengers) {
        super(2, numberOfPassengers);
    }

}
