package com.javarush.task.task36.task3602;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import java.util.Collections;
import java.util.List;

/* 
Найти класс по описанию Ӏ Java Collections: 6 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getExpectedClass());
    }

    public static Class getExpectedClass() {
        boolean itMyClass = false;
        Class myClass = null;
        for (Class clazz : Collections.class.getDeclaredClasses()
        ) {
            if (List.class.isAssignableFrom(clazz)) {
                if (Modifier.isPrivate(clazz.getModifiers())) {
                    if (Modifier.isStatic(clazz.getModifiers())) {
                        try {
                            Constructor constructor = clazz.getDeclaredConstructor();
                            constructor.setAccessible(true);

                            Method method = clazz.getDeclaredMethod("get", int.class);
                            method.setAccessible(true);

                            Object myClassObj = constructor.newInstance();
                            method.invoke(myClassObj, 10);


                        } catch (NoSuchMethodException e) {
                            // e.printStackTrace();
                        } catch (IllegalAccessException e) {
                            // e.printStackTrace();
                        } catch (InstantiationException e) {
                            //  e.printStackTrace();
                        } catch (InvocationTargetException e) {
                            // if (e.getCause().equals("IndexOutOfBoundsException"))
                            return clazz;
                            //    itMyClass = true;

                        }

                    }

                }
            }
        }
        return null;
    }
}
