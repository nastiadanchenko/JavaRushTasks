package com.javarush.task.task37.task3707;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by User on 17.11.2020.
 */
public class AmigoSet<E> extends AbstractSet<E> implements Serializable, Cloneable, Set<E> {
    private static final Object PRESENT = new Object();
    private transient HashMap<E, Object> map;

    public AmigoSet() {
        this.map = new HashMap<>();
    }

    public AmigoSet(Collection<? extends E> collection) {
        int capasity = 16 > (collection.size() / .75f) ? 16 : (int) Math.ceil(collection.size() / .75f);
        this.map = new HashMap<>(capasity);
        for (E element : collection
        ) {
            map.put(element, PRESENT);
        }
    }

    private void writeObject(ObjectOutputStream outputStream) {
        try {
            outputStream.defaultWriteObject();

            outputStream.writeInt(HashMapReflectionHelper.callHiddenMethod(map, "capacity"));
            outputStream.writeFloat(HashMapReflectionHelper.callHiddenMethod(map,"loadFactor"));
            outputStream.writeInt(map.keySet().size());

            for (E e: map.keySet()
                 ) {
                outputStream.writeObject(e);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private  void readObject(ObjectInputStream inputStream){
        try {
            inputStream.defaultReadObject();

            int capacity = inputStream.readInt();
            float loadFactor = inputStream.readFloat();
            int size = inputStream.readInt();

            map = new HashMap<>(capacity, loadFactor);

            for (int i = 0; i < size; i++) {
                E e = (E) inputStream.readObject();
                map.put(e,PRESENT);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public boolean add(E e) {
        return map.put(e, PRESENT) == null;
    }

    @Override
    public Iterator<E> iterator() {

        return this.map.keySet().iterator();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override
    public boolean remove(Object o) {
        return this.map.remove(o) == PRESENT;
    }

    @Override
    public boolean contains(Object o) {
        return this.map.containsKey(o);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Object clone() throws InternalError {

        try {
            AmigoSet copy = (AmigoSet) super.clone();
            copy.map = (HashMap) map.clone();
            return copy;
        } catch (Exception e) {
            throw new InternalError();
        }

    }

}
