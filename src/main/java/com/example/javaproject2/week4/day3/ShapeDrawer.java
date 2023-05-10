package com.example.javaproject2.week4.day3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public abstract class ShapeDrawer {
    public abstract String makeALine(int height, int i);

    public void printShape(int height) {
        for (int i = 0; i < height; i++) {
            System.out.printf("%s\n",makeALine(height, i));
        }
    }
    public void printShape(int height, String mode) throws IOException {
        if(mode == "file") {
            File file = new File("diamond.txt");
            FileWriter fw = new FileWriter(file);
            for (int i = 0; i < height; i++) {
                fw.write(makeALine(height, i) + "\n");
            }
            fw.close();
        } else if (mode == "console") {
            for (int i = 0; i < height; i++) {
                System.out.printf("%s\n",makeALine(height, i));
            }
        } else {
            System.out.println("지원하지 않는 모드입니다.");
        }
    }
}
