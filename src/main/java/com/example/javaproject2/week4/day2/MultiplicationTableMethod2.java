package com.example.javaproject2.week4.day2;

public class MultiplicationTableMethod2 {
    private String multipleSymbol;

    public MultiplicationTableMethod2(String multipleSymbol) {
        this.multipleSymbol = multipleSymbol;
    }

    public void  printMultiplicationTable(int dan) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d %s %d = %d\n", dan, multipleSymbol, i, dan * i);
        }
        System.out.println("-----------");
    }
    public static void main(String[] args) {
        MultiplicationTableMethod2 mt = new MultiplicationTableMethod2("*");
        mt.printMultiplicationTable(2);
        mt.printMultiplicationTable(4);
        mt.printMultiplicationTable(7);
        mt.printMultiplicationTable(9);
    }
}
