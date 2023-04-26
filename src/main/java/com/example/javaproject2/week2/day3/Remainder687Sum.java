package com.example.javaproject2.week2.day3;

public class Remainder687Sum {
    public static void main(String[] args) {
        int num = 687;
        int result1 = num % 10;
        num = num / 10;
        int result2 = num % 10;
        num = num / 10;
        int result3 = num % 10;

        System.out.println(result1 + result2 + result3);

    }
}
