package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.Tablet;

import java.io.IOException;
import java.util.List;

/**
 * Created by User on 26.09.2020.
 */
public class Order {
    private final Tablet tablet;
    protected List<Dish> dishes;

    public Order(Tablet tablet) throws IOException {
        this.tablet = tablet;
        dishes = ConsoleHelper.getAllDishesForOrder();
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    @Override
    public String toString() {
        return dishes.isEmpty() ? "" : String.format("Your order: %s of %s", dishes, tablet);
    }
    public int getTotalCookingTime(){
        int cookingTime = 0;
        for (Dish dish: dishes){
            cookingTime+=dish.getDuration();
        }
        return cookingTime;
    }

    public boolean isEmpty(){
        if (!dishes.isEmpty()) return false;
        return true;
    }

    public Tablet getTablet() {
        return tablet;
    }
}
