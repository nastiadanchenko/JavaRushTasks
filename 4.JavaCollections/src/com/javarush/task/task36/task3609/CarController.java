package com.javarush.task.task36.task3609;

public class CarController {
    private CarModel model;
    private SpeedometerView view;

    public CarController(CarModel model, SpeedometerView view) {
        this.model = model;
        this.view = view;
    }
    public void increaseSpeed(int seconds) {
        int speed = 0;
        if (getCarSpeed() < getCarMaxSpeed()) {
            speed = (int) (getCarSpeed()+ (3.5 * seconds));
           setCarSpeed(speed);;
        }
        if (getCarSpeed() >  getCarMaxSpeed()) {
            speed = getCarMaxSpeed();
            setCarSpeed(speed);
        }
    }
    public void decreaseSpeed(int seconds) {
        int speed = 0;
        if (getCarSpeed() > 0) {
            speed = getCarSpeed() - (12 * seconds);
            setCarSpeed(speed);
        }
        if (getCarSpeed() < 0) {
            speed = 0;
            setCarSpeed(speed);
        }
    }
    public String getCarBrand() {
        return model.getBrand();
    }

    public String getCarModel() {
        return model.getModel();
    }

    public void setCarSpeed(int speed) {
        model.setSpeed(speed);
    }

    public int getCarSpeed() {
        return model.getSpeed();
    }

    public int getCarMaxSpeed() {
        return model.getMaxSpeed();
    }

    public void updateView() {
        view.printCarDetails(getCarBrand(), getCarModel(), getCarSpeed());
    }
}