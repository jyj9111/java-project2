package com.example.javaproject2.week3.day1;

public class NewSwitchCaseDayOfMonth {
    public static void main(String[] args) {
        int month = 11;
        int lastDate = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> throw new IllegalArgumentException("해당 월은 없습니다. 입력 월:" + month);
        };

        System.out.printf("%d월은 %d일 까지 있습니다.\n", month, lastDate);

        // -> : 타입 추론
    }
}
