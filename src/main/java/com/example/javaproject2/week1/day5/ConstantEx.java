package com.example.javaproject2.week1.day5;

import com.example.javaproject2.PrintHello;

public class ConstantEx {
    public final int Max_LEVEL =  3;
    public static final int MIN_LEVEL = 1; // ConstantEx를 인스턴스화 시키지 않아도 static을 넣음으로써 사용가능 상수

    public static void main(String[] args) {
        final int iVal;
        iVal =1;
        System.out.println(iVal);

        final PrintHello printHello = new PrintHello();//참조변수도 사용가능
    }
}
