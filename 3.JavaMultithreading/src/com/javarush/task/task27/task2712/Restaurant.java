package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Dish;
import com.javarush.task.task27.task2712.kitchen.Order;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.io.IOException;
import java.util.List;

/**
 * Created by User on 26.09.2020.
 */
public class Restaurant {
    public static void main(String[] args) {
      //  Tablet tablet = new Tablet(1);


        try {
            for (int i = 0; i < 4; i++) {
                Order order1 = new Order(new Tablet(i));
            }
//
//            Order order2 = new Order(tablet);
//            Order order3 = new Order(tablet);
//            Order order4 = new Order(tablet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
