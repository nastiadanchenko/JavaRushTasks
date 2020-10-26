package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.kitchen.Dish;
import com.javarush.task.task27.task2712.kitchen.Order;
import com.javarush.task.task27.task2712.kitchen.Waiter;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 26.09.2020.
 */
public class Restaurant {
    public static void main(String[] args) {
        Tablet tablet = new Tablet(1);
        Cook cookAmigo = new Cook("Amigo");
        tablet.addObserver(cookAmigo);
        cookAmigo.addObserver(new Waiter());
        tablet.createOrder();
        tablet.createOrder();
        tablet.createOrder();
        tablet.createOrder();

    }
}
