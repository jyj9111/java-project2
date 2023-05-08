package com.example.javaproject2.week4.day1;

public class User {
    public String name;
    public String phoneNumber; //맨 앞 0이짤림
    public int age;

    boolean isAdult() {
        return age >= 18;
    }
}
