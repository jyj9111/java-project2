package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] split = str.split(":");

        int min = Integer.parseInt(split[1]);
        System.out.printf("%d",min);
    }
}
