package com.javarush.task.task37.task3707;

import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.*;

public class AmigoSet<E> extends AbstractSet implements Serializable, Cloneable, Set {

    @Override
    public Iterator iterator() {
        return map.keySet().iterator();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean remove(Object o) {
        return map.remove(o)!=null;
    }

    @Override
    public boolean add(Object o) {
        return map.put((E) o, PRESENT)==null;
    }

    @Override
    public Object clone() throws InternalError {
        try {
            AmigoSet<E> newSet = (AmigoSet<E>) super.clone();
            newSet.map = (HashMap<E, Object>) map.clone();
            return newSet;
        } catch (Exception e) {
            throw new InternalError();
        }
    }

    private void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException{
        s.defaultWriteObject();

        s.writeInt(HashMapReflectionHelper.callHiddenMethod(map, "capacity"));
        s.writeFloat(HashMapReflectionHelper.callHiddenMethod(map, "loadFactor"));

        s.writeInt(HashMapReflectionHelper.callHiddenMethod(map, "size"));

        for (E e : map.keySet())
            s.writeObject(e);

    }

    private void readObject(java.io.ObjectInputStream s)
            throws java.io.IOException, ClassNotFoundException {
        s.defaultReadObject();

        // Read capacity and verify non-negative.
        int capacity = s.readInt();
        if (capacity < 0) {
            throw new InvalidObjectException("Illegal capacity: " +
                    capacity);
        }

        // Read load factor and verify positive and non NaN.
        float loadFactor = s.readFloat();
        if (loadFactor <= 0 || Float.isNaN(loadFactor)) {
            throw new InvalidObjectException("Illegal load factor: " +
                    loadFactor);
        }

        int size = s.readInt();
        if (size < 0) {
            throw new InvalidObjectException("Illegal size: " +
                    size);
        }

        map = new HashMap<>(capacity, loadFactor);

        for (int i=0; i<size; i++) {
            @SuppressWarnings("unchecked")
            E e = (E) s.readObject();
            map.put(e, PRESENT);
        }

    }

    //--------------------------------------------

    public AmigoSet() {
        map = new HashMap<>();
    }

    public AmigoSet(Collection<? extends E> collection) {
        map = new HashMap<>(Math.max((int) (collection.size()/.75f) + 1, 16));
        addAll(collection);
    }

    //--------------------------------------------

    private static final Object PRESENT = new Object();
    private transient HashMap<E,Object> map;

}
