package com.example.javaproject2.week1;

import java.util.Scanner;

public class ScannerEx {
    public void readTwoNumbersAndPlus(){
        //숫자 2개 입력 받기
        //100 + 200 = 300
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt() + sc.nextInt());
    }
}
