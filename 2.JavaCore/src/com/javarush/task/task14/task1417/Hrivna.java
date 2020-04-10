package com.javarush.task.task14.task1417;

/**
 * Created by User on 09.04.2020.
 */
public class Hrivna extends Money {
    public  String getCurrencyName(){
        return "UAH";
    }
    public Hrivna(double amouth){
        super(amouth);
    }
}
