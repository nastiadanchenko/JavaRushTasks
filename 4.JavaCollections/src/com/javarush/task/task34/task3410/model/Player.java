package com.javarush.task.task34.task3410.model;

import java.awt.*;

public class Player extends CollisionObject implements Movable{
    public Player(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.YELLOW);

        int x = this.getX();
        int y = this.getY();
        int width = this.getWidth();
        int height = this.getHeight();

        graphics.fillOval(x-width/2,y-height/2,width,height);
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }


}
