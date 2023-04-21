package com.example.javaproject2.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User yongJin = new User();
        yongJin.name = "장용진";
        yongJin.phoneNum = "010-4633-5405";
        yongJin.age = 33;

        User kilDong = new User();
        kilDong.name = "홍길동";
        kilDong.phoneNum = "3번 비둘기 피죤";
        kilDong.age = 590;

        System.out.printf("%s님은 성인입니까? %s\n",yongJin.name,yongJin.isAdult());
        System.out.printf("%s님은 성인입니까? %s\n",kilDong.name,kilDong.isAdult());
    }
}
