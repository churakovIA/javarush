package com.javarush.task.task35.task3509;

import java.util.*;


/* 
Collections & Generics
*/
public class Solution {

    public static void main(String[] args) {
        List keys = new ArrayList();
        List values = new ArrayList();
        keys.add(new Object());
        keys.add(new Object());
        keys.add(new Object());
        values.add(new Object());
        values.add(new Object());
        values.add(new Object());
        newHashMap(keys, values);
        System.out.println(keys.size());

    }

    public static <T> ArrayList<T> newArrayList(T... elements) {
        //напишите тут ваш код
        ArrayList<T> list = new ArrayList<>(elements.length);
        list.addAll(Arrays.asList(elements));
        return list;
    }

    public static <T> HashSet<T> newHashSet(T... elements) {
        //напишите тут ваш код
        HashSet<T> set = new HashSet<>(elements.length);
        set.addAll(Arrays.asList(elements));
        return set;
    }

    public static <K,V> HashMap<K,V> newHashMap(List<? extends K> keys, List<? extends V> values) throws IllegalArgumentException {
        //напишите тут ваш код
        if(keys.size()!=values.size()) throw new IllegalArgumentException();
        HashMap<K, V> map = new HashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            map.put(keys.get(i), values.get(i));
        }
        return map;
    }
}
