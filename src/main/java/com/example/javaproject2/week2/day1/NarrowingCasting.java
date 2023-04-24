package com.example.javaproject2.week2.day1;

public class NarrowingCasting {
    public static void main(String[] args) {
        double dVal = 123.456;
        // double 타입인 d를 int 타입으로 강제 형 변환
        int iVal = (int) dVal;
        System.out.println("dVal = " + dVal);
        System.out.println("iVal = " + iVal);

        String str = "123ab"; // 숫자가 아닌 문자열
//        int num = Integer.parseInt(str); // NumberFormatException 발생

        String val1 = "1.5";
        String val2 = "2.5";
        System.out.println(val1 + val2);

//        String val1 = "1.5";
//        String val2 = "2.5";
//        int result = Integer.parseInt(val1) + Integer.parseInt(val2);
//        System.out.println(result);
//
//
//        String val1 = "1.5";
//        String val2 = "2.5";
//        float result = Float.parseFloat(val1) + Float.parseFloat(val2);
//        System.out.println(result);
    }
}
