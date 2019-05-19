package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        //{name=Ivanov, country=Ukraine, city=Kiev, age=null}
        Map<String, String> params = new HashMap<>();
        params.put("name", "Ivanov");
        params.put("country", "Ukraine");
        params.put("city", "Kiev");
        params.put("age", null);

        System.out.println(getQuery(params));

    }
    public static String getQuery(Map<String, String> params) {
        if(params == null) return null;
        StringBuilder stringBuilder = new StringBuilder();
        for(Map.Entry<String, String> entry : params.entrySet()){
            if(entry.getValue() != null && !"null".equals(entry.getValue())) {
                stringBuilder.append(String.format("%s = '%s' and ", entry.getKey(), entry.getValue()));
            }
        }
        if(stringBuilder.length() != 0)
            return stringBuilder.delete(stringBuilder.length()-5, stringBuilder.length()).toString();
        else
            return "";

    }
}
