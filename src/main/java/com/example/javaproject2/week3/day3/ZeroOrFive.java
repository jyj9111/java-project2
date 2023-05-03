package com.example.javaproject2.week3.day3;

public class ZeroOrFive {
    public static void main(String[] args) {
        int num = 550;
        int inNum = num;
        String flagText ="0과 5로 이루어진 숫자 입니다.";
        while(num > 0) {
            int remainder = num % 10;
            if(remainder % 5 != 0) {
                flagText = "0과 5로 이루어진 숫자가 아닙니다.";
            }
            num /= 10;
        }
        System.out.printf("%d은 " + flagText, inNum);
    }
}
