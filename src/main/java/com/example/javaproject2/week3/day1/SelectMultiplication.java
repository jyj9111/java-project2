package com.example.javaproject2.week3.day1;

public class SelectMultiplication {
    public static void main(String[] args) {
        int[] dan = {2, 5, 6, 9};

        for (int i = 0; i < dan.length; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", dan[i], j, dan[i] * j);
            }
            System.out.println("============");
        }
    }
}
