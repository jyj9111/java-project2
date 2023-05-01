package com.example.javaproject2.week3.day1;

public class LoopChar {
    public static void main(String[] args) {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.printf("%c ", c);;
        }
        System.out.printf("\n");
        for (int c = 'a'; c <= 'z'; c++) {
            System.out.printf("%d ", c);;
        }
        System.out.printf("\n");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.printf("%c ", c);;
        }
        System.out.printf("\n");
        for (int c = 'A'; c <= 'Z'; c++) {
            System.out.printf("%d ", c);;
        }
    }
}
