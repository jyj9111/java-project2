package com.example.javaproject2.codeup.to1100;

import java.util.Scanner;

public class Codeup1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num ; i++) {
            int input = sc.nextInt();
            arr[i] = input;
        }
        for (int i = num - 1; i >= 0 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
