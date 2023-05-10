package com.example.javaproject2.week4.day3;

import java.io.IOException;

public class FileOutputDiamondShapeDrawer extends ShapeDrawer{
    @Override
    public String makeALine(int height, int i) {
        int pivot = height / 2 ;
        if(i <= pivot) {
            return String.format("%s%s\n", " ".repeat(pivot - i), "*".repeat(2 * i + 1));
        } else {
            return String.format("%s%s\n", " ".repeat(i - pivot), "*".repeat(2 * (height - i) - 1));
        }

    }

    public static void main(String[] args) throws IOException {
        ShapeDrawer diamondShape = new FileOutputDiamondShapeDrawer();
        diamondShape.printShape(5,"file");
    }
}
