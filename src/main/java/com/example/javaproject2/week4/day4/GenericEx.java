package com.example.javaproject2.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {
    public static void main(String[] args) {
        // <String> 문자형
        List<String> strList = new ArrayList<>();
        strList.add("apple");
        strList.add("banana");
        strList.add("cherry");

        // <Integer> 정수형
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
    }
}
