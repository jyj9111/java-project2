package com.example.javaproject2.week2.day2;

public class StringSub {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.substring(0,1)); // H
        System.out.println(str.substring(0,2)); // He
        System.out.println(str.substring(0,3)); // Hel
        System.out.println(str.substring(0,4)); // Hell
        System.out.println(str.substring(0,5)); // Hello
        System.out.println(str.substring(3,5)); // Hello
    }
}
