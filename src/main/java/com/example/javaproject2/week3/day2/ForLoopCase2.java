package com.example.javaproject2.week3.day2;

public class ForLoopCase2 {
    public static void main(String[] args) {
        // 예제 1
//        for (int i = 0; i == i ; i++) {
//            System.out.println(i);
//        }
        // 2i를 조건의 비교대상으로 설정
        for (int i = 2; 2 * i <= 18 ; i++) {
            System.out.println(i);
        }

        // i <= 루트50을 다르게 표현
        for (int i = 2; i * i <= 50 ; i++) {
            System.out.println(i);
        }
    }
}
