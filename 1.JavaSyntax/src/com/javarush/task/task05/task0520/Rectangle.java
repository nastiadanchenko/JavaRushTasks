package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    private int top;
    private int left;
    private int width;
    private int height;

    public Rectangle(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public Rectangle (int top, int left){
        this.top = top;
        this.left = left;
        this.height = 0;
        this.width = 0;
    }
    public Rectangle( int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.width = height;

    }
    public Rectangle( Rectangle rectagle){
        this.top = rectagle.top;
        this.left = rectagle.left;
        this.width = rectagle.width;
        this.height = rectagle.height;

    }


    public static void main(String[] args) {

    }


}
