package com.javarush.task.task14.task1408;

/**
 * Created by User on 08.04.2020.
 */
public class BelarusianHen extends Hen {

    public int getCountOfEggsPerMonth(){
        return 5;
    }
    public String getDescription(){
        return String.format("%s Моя страна - %s. Я несу %s яиц в месяц.",super.getDescription(), Country.BELARUS, this.getCountOfEggsPerMonth());
    }
}
