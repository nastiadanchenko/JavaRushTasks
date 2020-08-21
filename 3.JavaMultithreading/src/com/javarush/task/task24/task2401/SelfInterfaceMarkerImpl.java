package com.javarush.task.task24.task2401;

/**
 * Created by User on 20.08.2020.
 */
public class SelfInterfaceMarkerImpl implements SelfInterfaceMarker {
    public void NameClass(){
        System.out.println(getClass());
    }
    public void something(){}
}
