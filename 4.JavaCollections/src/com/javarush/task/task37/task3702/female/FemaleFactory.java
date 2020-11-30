package com.javarush.task.task37.task3702.female;

import com.javarush.task.task37.task3702.AbstractFactory;
import com.javarush.task.task37.task3702.Human;
import com.javarush.task.task37.task3702.male.KidBoy;
import com.javarush.task.task37.task3702.male.Man;
import com.javarush.task.task37.task3702.male.TeenBoy;

public class FemaleFactory implements AbstractFactory {
    public Human getPerson(int age){
        Human result = null;
        if (age<13) result = new KidGirl();
        if (age>12&&age<20) result = new TeenGirl();
        if (age>19) result = new Woman();
        return result;
    }
}
