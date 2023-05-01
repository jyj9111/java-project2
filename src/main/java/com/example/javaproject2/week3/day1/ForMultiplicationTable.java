package com.example.javaproject2.week3.day1;

public class ForMultiplicationTable {
    public static void main(String[] args) {
        // 구구단 2단
        for (int i = 1; i <= 9 ; i++) {
            System.out.printf("2 * %d = %d\n", i, i * 2);
        }
        System.out.println("============");
        // 구구단 3단
        for (int i = 1; i <= 9 ; i++) {
            System.out.printf("3 * %d = %d\n", i, i * 3);
        }
        System.out.println("============");
        // 구구단 4단
        for (int i = 1; i <= 9 ; i++) {
            System.out.printf("4 * %d = %d\n", i, i * 4);
        }
        System.out.println("============");
    }
}
