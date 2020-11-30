package com.javarush.task.task37.task3702.male;

import com.javarush.task.task37.task3702.AbstractFactory;
import com.javarush.task.task37.task3702.Human;

public class MaleFactory implements AbstractFactory {

    public Human getPerson(int age){
        Human result = null;
        if (age<13) result = new KidBoy();
        if (age>12&&age<20) result = new TeenBoy();
        if (age>19) result = new Man();
        return result;
    }
}
