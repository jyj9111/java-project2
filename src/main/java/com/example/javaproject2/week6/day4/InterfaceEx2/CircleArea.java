package com.example.javaproject2.week6.day4.InterfaceEx2;

public class CircleArea {
    public static void main(String[] args) {
        Shape circleArea = new Circle(2);

        System.out.println(circleArea.calculateArea());
        circleArea.display();

    }
}
