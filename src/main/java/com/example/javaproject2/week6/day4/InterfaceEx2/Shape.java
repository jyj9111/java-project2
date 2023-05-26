package com.example.javaproject2.week6.day4.InterfaceEx2;

public interface Shape {
    double calculateArea();

    default void display() {
        System.out.println("디폴트 메서드");
    }
}
