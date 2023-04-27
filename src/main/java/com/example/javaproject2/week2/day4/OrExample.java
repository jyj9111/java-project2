package com.example.javaproject2.week2.day4;

public class OrExample {
    public static void main(String[] args) {
        int yearsOfExp = 8;
        int numOfProj = 12;

        boolean isPromotion = yearsOfExp > 5 || numOfProj > 10;
        System.out.println("isPromotion = " + isPromotion);
    }
}
