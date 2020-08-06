package com.javarush.task.task24.task2413;

/**
 * Created by User on 05.08.2020.
 */
public abstract class BaseObject {
    private double x;
    private double y;
    private double radius;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public abstract void draw(Canvas canvas);

    public abstract void move();
    public boolean isIntersec(BaseObject o){
        boolean result = false;
        double distance = Math.sqrt(Math.pow((this.x - o.x), 2) + Math.pow((this.y - o.y), 2));
        if (distance <= this.radius || distance <= o.radius) {
            result = true;
        }
        return result;
           }
}