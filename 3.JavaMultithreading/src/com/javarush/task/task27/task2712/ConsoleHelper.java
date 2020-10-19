package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 26.09.2020.
 */
public class ConsoleHelper {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message){
        System.out.println(message);
    }
    public static String readString() throws IOException {
       // String stringReader = reader.readLine();
        return reader.readLine();
    }

    public static List<Dish> getAllDishesForOrder() throws IOException {
        List<Dish> listOrder = new ArrayList<>();
        writeMessage(Dish.allDishesToString());
        writeMessage("Введите в название блюда. Для засершения заказа введите 'exit'.");
        while (true){
            String dish = readString();
            if (dish.equals("exit")) break;
            try {
                listOrder.add(Dish.valueOf(dish));
            } catch (Exception e) {
                writeMessage("Такого блюда не существует.");
            }
        }

        return listOrder;
    }
}
