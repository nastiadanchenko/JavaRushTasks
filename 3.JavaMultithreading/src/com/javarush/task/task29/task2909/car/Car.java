package com.javarush.task.task29.task2909.car;

import java.util.Date;

public abstract class Car {
    static public final int TRUCK = 0;
    static public final int SEDAN = 1;
    static public final int CABRIOLET = 2;
    static public final int MAX_TRUCK_SPEED = 80;
    static public final int MAX_SEDAN_SPEED = 120;
    static public final int MAX_CABRIOLET_SPEED = 90;

    double fuel;

    public double summerFuelConsumption;
    public double winterFuelConsumption;
    public double winterWarmingUp;

    private int type;

    private boolean driverAvailable;
    private int numberOfPassengers;

    protected Car(int type, int numberOfPassengers) {
        this.type = type;
        this.numberOfPassengers = numberOfPassengers;
    }
    public static Car create(int type, int numberOfPassengers){
        Car car = null;
        switch (type) {
            case 0:
                return car=new Truck(numberOfPassengers);
            case 1:
                return car=new Sedan(numberOfPassengers);
            case 2:
                return car=new Cabriolet(numberOfPassengers);
        }
        return car;
    }
    public void fill(double numberOfLiters) throws Exception {
            if (numberOfLiters < 0) {
                throw new Exception();
            }else fuel += numberOfLiters;

        //return 0;
    }
    public boolean isSummer(Date date , Date summerStart, Date summerEnd){
        if (date.after(summerStart)&&date.before(summerEnd)) return true;
        return false;
    }
    public  double getWinterConsumption(int length){
        double consumption= length * winterFuelConsumption + winterWarmingUp;
        return consumption;
}
   public double getSummerConsumption(int length){
       double consumption = length * summerFuelConsumption;
       return consumption;
    }
    public double getTripConsumption(Date date, int length, Date SummerStart, Date SummerEnd) {
        double consumption;
        if (isSummer(date,SummerStart,SummerEnd)) {
           consumption= getSummerConsumption(length);
        } else {
           consumption= getWinterConsumption(length);
        }
        return consumption;
    }
private boolean canPassengersBeTransferred(){
    if (isDriverAvailable()==true&&fuel>0.0) return true;
    return false;
}
    public int getNumberOfPassengersCanBeTransferred() {
        if (canPassengersBeTransferred())
            return numberOfPassengers;
        return 0 ;
    }

    public boolean isDriverAvailable() {
        return driverAvailable;
    }

    public void setDriverAvailable(boolean driverAvailable) {
        this.driverAvailable = driverAvailable;
    }

    public void startMoving() {
        if (getNumberOfPassengersCanBeTransferred() > 0){
            fastenPassengersBelts();
        }
        fastenDriverBelt();
    }

    public void fastenPassengersBelts() {
    }

    public void fastenDriverBelt() {
    }

    public abstract int getMaxSpeed();

}