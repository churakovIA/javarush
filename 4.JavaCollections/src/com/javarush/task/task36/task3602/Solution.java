package com.javarush.task.task36.task3602;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collections;

/* 
Найти класс по описанию
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getExpectedClass());
    }

    public static Class getExpectedClass() {
        Class<?>[] declaredClasses = Collections.class.getDeclaredClasses();
        for (Class<?> declaredClass : declaredClasses) {
            if(Modifier.isStatic(declaredClass.getModifiers())
                    && Modifier.isPrivate(declaredClass.getModifiers())
                    && java.util.List.class.isAssignableFrom(declaredClass)){
                //System.out.println(declaredClass);
                Method get;
                try {
                    get = declaredClass.getMethod("get", int.class);
                } catch (NoSuchMethodException e) {
                    continue;
                }

                get.setAccessible(true);
                try {
                    Constructor<?> constructor = declaredClass.getDeclaredConstructor();
                    constructor.setAccessible(true);
                    java.util.List list = (java.util.List) constructor.newInstance();
                    list.get(0);
                } catch (IndexOutOfBoundsException e) {
                    return declaredClass;
                } catch (Exception e) {
                    continue;
                }



            }

        }

        return null;
    }
}
