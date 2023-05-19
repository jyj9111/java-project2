package com.example.javaproject2.week5.day4;

public class BracketWithoutStack2 {
    public static void main(String[] args) {
        String brackets = "(())())";

        while (brackets.indexOf("()") != -1) {
            String[] split = brackets.split("\\(\\)");
            brackets = String.join("", split);
        }
        System.out.println(brackets);
    }
}
