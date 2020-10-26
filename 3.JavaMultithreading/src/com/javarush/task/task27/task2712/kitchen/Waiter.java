package com.javarush.task.task27.task2712.kitchen;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by User on 22.10.2020.
 */
public class Waiter implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg.toString() + " was cooked by " + o.toString());
    }

}
