package com.example.javaproject2.codeup;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Codeup1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int asc = (int)ch + 1;
        System.out.println((char)asc);

//      다른 예
//        InputStreamReader isr = new InputStreamReader(System.in);
//        char c2 = (char) (isr.read()+1);
//        System.out.println(c2);
    }
}
