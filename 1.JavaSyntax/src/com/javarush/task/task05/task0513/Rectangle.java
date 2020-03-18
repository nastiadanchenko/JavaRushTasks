package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    private int top;
    private int left;
    private int width;
    private int height;

    public void initialize(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public void  initialize (int top, int left){
        this.top = top;
        this.left = left;
        this.height = 0;
        this.width = 0;
    }
    public void initialize( int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.width = height;

    }
    public void initialize( Rectangle rectagle){
        this.top = rectagle.top;
        this.left = rectagle.left;
        this.width = rectagle.width;
        this.height = rectagle.height;

    }

    public static void main(String[] args) {

    }
}
