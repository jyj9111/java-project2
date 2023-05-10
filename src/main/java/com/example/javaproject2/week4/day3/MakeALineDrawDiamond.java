package com.example.javaproject2.week4.day3;

public class MakeALineDrawDiamond {
    public static String getRepeatSymbol(String symbol, int num) {
        return symbol.repeat(num);
    }
    public static String makeALine(int height, int i) {
        int pivot = height / 2;

        if(i <= pivot) {
             return String.format("%s%s",getRepeatSymbol(" ", pivot - i), getRepeatSymbol("*", 2 * i + 1));
        } else {
            return String.format("%s%s",getRepeatSymbol(" ", i - pivot), getRepeatSymbol("*", 2 * (height - i) - 1));
        }
    }
    public static void main(String[] args) {
        int height = 9;

        for (int i = 0; i < height; i++) {
            System.out.println(makeALine(height, i));
        }
    }
}
