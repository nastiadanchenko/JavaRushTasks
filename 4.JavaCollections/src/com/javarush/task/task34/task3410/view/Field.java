package com.javarush.task.task34.task3410.view;

import com.javarush.task.task34.task3410.controller.EventListener;
import com.javarush.task.task34.task3410.model.GameObject;

import javax.swing.*;
import java.awt.*;
import java.util.Set;

public class Field extends JPanel {
    private View view;
    private EventListener eventListener;

    public Field(View view) {
        this.view = view;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        Set<GameObject> gameObjects = view.getGameObjects().getAll();
        gameObjects.forEach(gameObject -> gameObject.draw(g));

    }

    public void setEventListener(EventListener eventListener) {
        this.eventListener = eventListener;
    }
}