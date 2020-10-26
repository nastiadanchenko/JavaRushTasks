package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.statistic.StatisticManager;
import com.javarush.task.task27.task2712.statistic.event.CookedOrderEventDataRow;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by User on 22.10.2020.
 */
public class Cook extends Observable implements Observer {
    private String name;

    public Cook(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Order order = (Order) arg;
        //if (order.isEmpty())return;
        System.out.println("Start cooking - " + arg.toString()+", cooking time "+order.getTotalCookingTime()+"min");
        StatisticManager.getInstance().register(new CookedOrderEventDataRow(order.getTablet().toString(),
                this.toString(), order.getTotalCookingTime() * 60, order.getDishes()));
        setChanged();
        notifyObservers(arg);

    }
}
