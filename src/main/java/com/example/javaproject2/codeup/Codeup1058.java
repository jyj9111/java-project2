package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result;
        if ((num1 != 1) && (num2 != 1))
            result = 1;
        else
            result = 0;
        System.out.println(result);
    }
}
