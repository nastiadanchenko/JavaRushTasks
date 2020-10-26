package com.javarush.task.task27.task2712.kitchen;

import java.util.Arrays;

/**
 * Created by User on 26.09.2020.
 */
public enum Dish {

    Fish(25), Steak(30), Soup(15), Juice(5), Water(3);

    private int duration;



    Dish(int i) {
        this.duration = i;
    }

    public int getDuration() {
        return duration;
    }

    public static String allDishesToString(){

        return Arrays.toString(Dish.values());

    }


}
