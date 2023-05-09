package com.example.javaproject2.week4.day2;

import java.util.Scanner;

public class ReversePyramid {
    // 멤버변수 선언
    private String spaceChar = "0";
    // Alt + Insert 로 생성자 붙여주기
    public ReversePyramid(String spaceChar) {
        this.spaceChar = spaceChar;
    }
    // 역피라미드 만들기
    public String makeALine(int height, int i) {
        // 메소드로 핵심기능 분리
        return String.format("%s%s\n", spaceChar.repeat(height - i),
                "*".repeat(2 * i - 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();

        ReversePyramid reversePyramid = new ReversePyramid(" ");
        // 기존 로직을 메소드 호출로 변경
        for(int i = height; i > 0; i--) {
            System.out.printf(reversePyramid.makeALine(height, i));
        }
    }
}
