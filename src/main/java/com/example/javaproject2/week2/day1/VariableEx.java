package com.example.javaproject2.week2.day1;

public class VariableEx {
    public static void main(String[] args) {
        //모두다 1이지만 타입이 각각 다른 1
        String sOne = new String("1");
        int iOne = 1;
        float fOne = 1.0f; // f를 안붙이면 기본값은 double로 인식

        System.out.printf("String: %s Int: %d Float: %f", sOne, iOne, fOne);
    }
}
