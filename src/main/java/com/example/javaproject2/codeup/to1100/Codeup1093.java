package com.example.javaproject2.codeup.to1100;

import java.util.Scanner;

public class Codeup1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[24];
        for (int i = 0; i < num ; i++) {
            int input = sc.nextInt();
            arr[input] += 1;
        }
        for (int i = 1; i < 24 ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}