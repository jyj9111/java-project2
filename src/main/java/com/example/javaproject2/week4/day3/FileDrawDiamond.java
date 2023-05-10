package com.example.javaproject2.week4.day3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDrawDiamond {
    public static String getRepeatSymbol(String symbol, int num) {
        return symbol.repeat(num);
    }
    public static void main(String[] args) throws IOException {
        File file =  new File("diamond.txt");
        FileWriter fw = new FileWriter(file);
        int height = 9;
        int pivot = height / 2;

        for (int i = 0; i < height; i++) {
            if(i <= pivot) {
                fw.write(getRepeatSymbol(" ", pivot - i) + getRepeatSymbol("*", 2 * i + 1) + "\n");
            } else {
                fw.write(getRepeatSymbol(" ", i - pivot) + getRepeatSymbol("*", 2 * (height - i) - 1) + "\n");
            }
        }
        fw.close();
    }
}
