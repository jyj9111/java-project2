package com.example.javaproject2.week6.day4.InterfaceEx;

public class Bird implements Ani, Shape{
    @Override
    public void makeSound() {
        System.out.println("Ani: 짹짹");
    }

    @Override
    public void run() {
        System.out.println("Shape: 푸드덕");
    }
}
