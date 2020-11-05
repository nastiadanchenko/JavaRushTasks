package com.javarush.task.task32.task3205;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by User on 05.11.2020.
 */
public class CustomInvocationHandler implements InvocationHandler {
    private SomeInterfaceWithMethods someInterfaceWithMethods;


    public CustomInvocationHandler(SomeInterfaceWithMethods original) {
        this.someInterfaceWithMethods = original;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName()+ " in");
        Object o = method.invoke(someInterfaceWithMethods, args);
        System.out.println(method.getName()+ " out");
        return o;
    }
}
