package com.example.javaproject2.week2.day3;

public class RemainderQuoti {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;

        int remain = num1 / num2;
        int quot = num1 % num2;
        System.out.printf("10을 3으로 나눈 몫은 %d이고 나머지는 %d입니다.", remain, quot);
    }
}
