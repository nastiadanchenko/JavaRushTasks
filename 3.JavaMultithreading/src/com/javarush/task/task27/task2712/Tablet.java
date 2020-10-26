package com.javarush.task.task27.task2712;


import com.javarush.task.task27.task2712.ad.Advertisement;
import com.javarush.task.task27.task2712.ad.AdvertisementManager;
import com.javarush.task.task27.task2712.ad.NoVideoAvailableException;
import com.javarush.task.task27.task2712.kitchen.Order;
import com.javarush.task.task27.task2712.statistic.StatisticManager;
import com.javarush.task.task27.task2712.statistic.event.NoAvailableVideoEventDataRow;
import com.javarush.task.task27.task2712.statistic.event.VideoSelectedEventDataRow;

import java.io.IOException;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by User on 26.09.2020.
 */
public class Tablet extends Observable {
    private final int number;
    private static Logger logger = Logger.getLogger(Tablet.class.getName());

    public Tablet(int number) {
        this.number = number;
    }

    public Order createOrder() {
        Order newOrder;
        try {
            newOrder = new Order(this);
            try {
                AdvertisementManager manager = new AdvertisementManager(newOrder.getTotalCookingTime() * 60);
                Advertisement adv = new Advertisement(newOrder,)
               StatisticManager.getInstance().register(new VideoSelectedEventDataRow(manager.getStorage(),manager.getStorage().list().get(),newOrder.getTotalCookingTime()*60));
                manager.processVideos();
            } catch (NoVideoAvailableException e) {
                StatisticManager.getInstance().register(new NoAvailableVideoEventDataRow(newOrder.getTotalCookingTime()*60));
                logger.log(Level.INFO,"No video is available for the order " + newOrder);
            }
            if (!newOrder.isEmpty()) {
                setChanged();
                notifyObservers(newOrder);
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Console is unavailable.");
            return null;
        }
        return newOrder;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "number=" + number +
                '}';
    }
}
