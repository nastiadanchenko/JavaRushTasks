package com.javarush.task.task22.task2213;

/**
 * Created by User on 06.11.2020.
 */
public class Figure {
    private int y;
    private int x;
    private int[][] matrix;

    public Figure(int x, int y, int[][] matrix) {
        this.x = x;
        this.y = y;
       this.matrix = matrix;
    }

    public void left(){}

    public void right(){}

    public void down(){}

    public void up(){}

    public void rotate(){}

    public void downMaximum(){}

    public boolean isCurrentPositionAvailable(){
        return true;
    }

    public void landed(){}

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public int[][] getMatrix() {
        return matrix;
    }
}
