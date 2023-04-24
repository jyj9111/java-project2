package com.example.javaproject2.week2.day1;

public class SpringPlusInt {
    public static void main(String[] args) {
        // 결과 : 11
        System.out.println("1" + 1);

        //error
        //int result = 1 +"1";

        String result = 1 + "1";
        System.out.println(result);

        int iResult = 1 + Integer.parseInt("1");
        System.out.println(iResult);
    }
}
