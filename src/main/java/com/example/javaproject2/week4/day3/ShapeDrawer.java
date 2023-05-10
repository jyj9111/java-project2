package com.example.javaproject2.week4.day3;

public abstract class ShapeDrawer {
    public abstract String makeALine(int height, int i);

    public void printShape(int height) {
        for (int i = 0; i < height; i++) {
            System.out.printf("%s\n",makeALine(height, i));
        }
    }
}
