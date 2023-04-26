package com.example.javaproject2.week2.day3;

public class ClassInSchoolTest {
    public static void main(String[] args) {
        ClassInSchool classInSchool = new ClassInSchool();
        classInSchool.no = 1;
        classInSchool.teacher.name = "홍길동";
        classInSchool.teacher.age = 33;
        classInSchool.teacher.address = "경기 수원시 장안구 ~ ";
        classInSchool.students = new Student[30];

        System.out.printf("%d반 담임선생님 성함은 %s 입니다.", classInSchool.no, classInSchool.teacher.name);
    }
}
