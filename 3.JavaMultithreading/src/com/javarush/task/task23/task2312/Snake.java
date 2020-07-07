package com.javarush.task.task23.task2312;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 07.07.2020.
 */
public class Snake {
    private List<SnakeSection> sections;
    private boolean isAlive;
    private SnakeDirection direction;

    public Snake(int x, int y) {
        this.sections = new ArrayList<>();
        this.isAlive = true;
        sections.add(new SnakeSection(x, y));

    }

    public List<SnakeSection> getSections() {
        return sections;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection getDirection() {
        return direction;
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }

    public int getX(){
        SnakeSection x=this.sections.get(0);

        return x.getX();
    }
    public int getY(){
        SnakeSection y = this.sections.get(0);
        return y.getY();
    }
    public void move(){}
}
