package com.example.javaproject2.week6.day4.AbstractEx;

public class DogTest {
    public static void main(String[] args) {
        Animal dog = new Dog(); // 부모클래스 <이름> = new 자식클래스; 일반적
        dog.makeSound();
        dog.eat();
    }
}
