package com.example.javaproject2.week4.day2;

public class MultiplicationTableMethod {

    public static void  printMultiplicationTable(String multipleSymbol, int dan) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d %s %d = %d\n", dan,multipleSymbol, i, dan * i);
        }
        System.out.println("-----------");
    }
    public static void main(String[] args) {
        printMultiplicationTable("x",2);
        printMultiplicationTable("x",4);
        printMultiplicationTable("x",6);
        printMultiplicationTable("x",9);
    }
}
