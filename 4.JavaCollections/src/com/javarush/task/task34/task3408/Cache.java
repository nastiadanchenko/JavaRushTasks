package com.javarush.task.task34.task3408;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.WeakHashMap;

public class Cache<K, V> {
    private Map<K, V> cache = new WeakHashMap<>();   //TODO add your code here


    public V getByKey(K key, Class<V> clazz) throws Exception {
        //TODO add your code here
        if (!cache.containsKey(key)) // Если объекта не существует в кэше, то добавьте в кэш новый экземпляр используя рефлексию
            cache.put(key, clazz.getConstructor(key.getClass()).newInstance(key));
        return cache.get(key); // возвращием  объект из cache для ключа key
    }

    public boolean put(V obj) {
        //TODO add your code here

        Method method = null;

        try {
            method = obj.getClass().getDeclaredMethod("getKey"); // получи ссылку на метод "getKey"
            method.setAccessible(true); // получаем доступ к методу, т.к. он privet
            cache.put((K) method.invoke(obj), obj); // вызываем метод getKey у объекта obj,  и добавляем его в кэш
            return cache.containsKey((K) method.invoke(obj));
        } catch (Exception e){} // игнорируем возникшие ошибки
        /*catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }*/
        return false;
    }

    public int size() {
        return cache.size();
    }
}
