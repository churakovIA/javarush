package com.javarush.task.task35.task3507;

import java.io.File;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashSet;
import java.util.Set;

/*
ClassLoader - что это такое?
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        Set<? extends Animal> allAnimals = getAllAnimals(Solution.class.getProtectionDomain().getCodeSource().getLocation().getPath() + Solution.class.getPackage().getName().replaceAll("[.]", "/") + "/data");
        System.out.println(allAnimals);
    }

    public static Set<? extends Animal> getAllAnimals(String pathToAnimals) throws Exception {

        Set<Animal> set = new HashSet<>();

        String packageName = pathToAnimals.replace(Solution.class.getProtectionDomain().getCodeSource().getLocation().getPath(), "").replace('/', '.');

        URL[] urls = {new URL("file://"+pathToAnimals)};
        URLClassLoader loader = new URLClassLoader(urls);

        File folder = new File(pathToAnimals.substring(1));
        for (File file : folder.listFiles(((dir, name) -> name.endsWith(".class")))){
            String moduleName = packageName+'.'+file.getName().replace(".class", "");
            Class<?> aClass = loader.loadClass(moduleName);
            if(hasInterface(aClass, Animal.class) && hasEmptyConstructor(aClass)){
                set.add((Animal) aClass.newInstance());
            }
        }

        return set;

    }

    private static boolean hasInterface(Class<?> aClass, Class<Animal> animalClass) {

        Class<?>[] interfaces = aClass.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            if(anInterface == animalClass) return true;
        }

        return false;
    }

    private static boolean hasEmptyConstructor(Class<?> aClass) {

        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            if (constructor.getParameterCount() == 0)
                return true;
        }

        return false;
    }
}
