package com.javarush.task.task33.task3313;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/* 
Сериализация даты в JSON
*/
public class Solution {
    public static void main(String[] args) throws JsonProcessingException {
        Event event = new Event("event#1");

        String result = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(event);

        System.out.println(result);
    }
}
