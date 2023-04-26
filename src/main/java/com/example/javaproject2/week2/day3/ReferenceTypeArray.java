package com.example.javaproject2.week2.day3;

public class ReferenceTypeArray {
    public static void main(String[] args) {
        Student[] students = new Student[2];

        students[0] = new Student();
        students[0].name = "장용진";
        students[0].phoneNumber = "010-1111-2222";
        students[0].age = 100;
        students[1] = new Student();
        students[1].name = "홍길동";
        students[1].phoneNumber = "010-3333-4444";
        students[1].age = 101;
    }
}
