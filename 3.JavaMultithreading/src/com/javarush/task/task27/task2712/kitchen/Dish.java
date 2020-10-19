package com.javarush.task.task27.task2712.kitchen;

import java.util.Arrays;

/**
 * Created by User on 26.09.2020.
 */
public enum Dish {
    Fish, Steak, Soup, Juice, Water;

    public static String allDishesToString(){
        return Arrays.toString(values());
    }

}
