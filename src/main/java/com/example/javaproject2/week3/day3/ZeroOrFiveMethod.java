package com.example.javaproject2.week3.day3;

public class ZeroOrFiveMethod {
    public static boolean isZeroOrFive(int num) {
        while(num > 0) {
            int remainder = num % 10;
            if(remainder % 5 != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 550;
        int cnt = 0;

        System.out.printf("%d는 5와 0으로만 구성 되어있나요? %b", num, isZeroOrFive(num));
    }
}
