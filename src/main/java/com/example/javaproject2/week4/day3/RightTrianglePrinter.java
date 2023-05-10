package com.example.javaproject2.week4.day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RightTrianglePrinter {

    private Printer printer;

    public RightTrianglePrinter(Printer printer) {
        this.printer = printer;
    }

    // 라인 만들기
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", "", "*".repeat(i));
    }

    // 모양 만들기
    public void printShape(int h) throws IOException {
        String[] lines = new String[h];

        for (int i = 0; i < h; i++) {
            lines[i] = makeALine(h , i + 1);
        }
        // 모양 출력하기
        printer.print(lines);

    }

    public static void main(String[] args) throws IOException {
        RightTrianglePrinter rtp = new RightTrianglePrinter(new FilePrinter());
        rtp.printShape(7);
    }
}
