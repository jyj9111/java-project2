package com.example.javaproject2.week4.day3;

public class DrawDiamond {
    public static String getRepeatSymbol(String symbol, int num) {
        return symbol.repeat(num);
    }
    public static void main(String[] args) {
        int height = 9;
        int pivot = height / 2;

        for (int i = 0; i < height; i++) {
            if(i <= pivot) {
                //피라미드
                System.out.println(getRepeatSymbol(" ", pivot - i) + getRepeatSymbol("*", 2 * i + 1));
                //System.out.printf("i:%d 0:%d *:%d\n", i, pivot - i, 2 * i + 1);
            } else {
                //역피라미드
                System.out.println(getRepeatSymbol(" ", i - pivot) + getRepeatSymbol("*", 2 * (height - i) - 1));
                //System.out.printf("i:%d 0:%d *:%d\n", i, i - pivot, 2 * (height - i) - 1);
            }
            //System.out.printf("%d\n", i);
        }
    }
}
