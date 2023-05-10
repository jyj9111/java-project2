package com.example.javaproject2.week4.day3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileOutputDiamond {
    public void fileOutputShape(String[] result, String fileName) throws IOException {
        File file =  new File(fileName);
        FileWriter fw = new FileWriter(file);

        for (int i = 0; i < result.length; i++) {
            fw.write(result[i] + "\n");
        }
        fw.close();
    }

    public String[] shapeLines (int height) {
        String[] result = new String[height];
        for (int i = 0; i < height; i++) {
            result[i] = makeALine(height, i);
        }
        return result;
    }

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
    public static void main(String[] args) throws IOException {
        int height = 9;
        String fileName = "diamond3";
        FileOutputDiamond fileOutputDiamond = new FileOutputDiamond();
        fileOutputDiamond.fileOutputShape(fileOutputDiamond.shapeLines(height), fileName);
    }
}
