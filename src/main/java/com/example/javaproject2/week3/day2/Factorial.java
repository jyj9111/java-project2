package com.example.javaproject2.week3.day2;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int answer = 1; // * 연산이기 때문에 0으로 하면 안됨.

        // 1 -> 5
        for (int i = 1; i <= n; i++) {
            answer *= i;
            System.out.println(answer);
        }
        // 5 -> 1
        answer = 1;
        for (int i = n; i >= 1 ; i--) {
            answer *= i;
            System.out.println(answer);
        }
    }
}
