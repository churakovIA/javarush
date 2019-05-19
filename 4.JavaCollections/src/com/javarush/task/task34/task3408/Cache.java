package com.javarush.task.task34.task3408;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.WeakHashMap;

public class Cache<K, V> {
    private Map<K, V> cache = new WeakHashMap<>();   //TODO add your code here

    public V getByKey(K key, Class<V> clazz) throws Exception {
        //TODO add your code here
        V v = cache.get(key);
        if(v == null){
            v = clazz.getConstructor(key.getClass()).newInstance(key);
            //put(v);
            cache.put(key, v);
        }
        return v;
    }

    public boolean put(V obj) {
        //TODO add your code here
        try {
            Method getKey = obj.getClass().getDeclaredMethod("getKey");
            getKey.setAccessible(true);
            Object key = getKey.invoke(obj);
            cache.put((K) key, obj);
            return cache.containsKey((K) key);
        } catch (Exception e) {}
        return false;
    }

    public int size() {
        return cache.size();
    }
}
