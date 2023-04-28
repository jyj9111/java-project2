package com.example.javaproject2.week2.day5;

public class OtherClinicHours {
    public static void main(String[] args) {
        String day = "월";
        String time = "휴진";

        switch (day) {
            case "월", "화", "수", "목", "금": time = "9:00 - 18:30"; break;
            case "토": time = "8:30 - 13:00"; break;
            case "일": time = "휴진";
        }
        System.out.printf("장내과의 %s요일 진료시간은 %s입니다.\n", day, time);
    }
}
