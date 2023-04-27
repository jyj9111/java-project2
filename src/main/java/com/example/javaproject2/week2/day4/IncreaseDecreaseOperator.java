package com.example.javaproject2.week2.day4;

public class IncreaseDecreaseOperator {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("i = " + i++); // 일단 i = 10 출력(사용)하고 1 증가시킨다
        System.out.println("i = " + i);   // 그래서 현재 i = 11
        System.out.println("i = " + ++i); // 일단 i를 1증가 시킨 후 출력(사용)한다.

        i = 10;
        System.out.println("i = " + i--); // 일단 i = 10 출력(사용)하고 1 감소시킨다
        System.out.println("i = " + i);   // 그래서 현재 i = 9
        System.out.println("i = " + --i); // 일단 i를 1감소 시킨 후 출력(사용)한다.
    }
}
