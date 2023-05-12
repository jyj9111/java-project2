package com.example.javaproject2.week4.day4;

import com.example.javaproject2.week4.day1.User;

import java.util.ArrayList;
import java.util.List;

public class ListUser {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        User user1 = new User("김미미", "010-1234-1234", 37);
        userList.add(user1);

        User user2 = new User("이미미", "010-7777-7777", 36);
        userList.add(user2);

        for (User usr : userList) {
            System.out.printf("%s님의 전화번호는 %s 입니다.\n", usr.getName(), usr.getPhoneNumber());
        }

    }
}
