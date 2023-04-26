package com.example.javaproject2.week2.day3;

public class MinuteSecond {
    public static void main(String[] args) {
        int sec = 383;
        int min = sec / 60 ;
        int remainSec = 383 % 60;
        System.out.printf("%d초는 %d분 %d초", sec, min, remainSec);
    }
}
