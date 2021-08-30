package com.javarush.task.task34.task3410.view;

import com.javarush.task.task34.task3410.model.Box;
import com.javarush.task.task34.task3410.model.Player;

import javax.swing.*;
import java.awt.*;

public class Field extends JPanel {
    private View view;

    public Field(View view) {
        this.view = view;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Box box = new Box(5, 5);
        box.draw(g);
        Player player = new Player(7, 7);
        player.draw(g);
    }
}
