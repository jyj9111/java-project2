package com.example.javaproject2.week3.day3;

public class IsPrimeRoot {
    public static void main(String[] args) {
        int num = 8;
        int factors = 0;
        for (int i = 2; i * i < num; i++) {
            if (num % i == 0) factors++;
        }
        System.out.println(factors == 0 ? "prime" : "not prime");
    }
}
