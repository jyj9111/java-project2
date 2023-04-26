package com.example.javaproject2.week2.day3;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int [][] arr3by3 = new int[3][3];
        arr3by3[0][0] = 1;
        arr3by3[1][1] = 2;
        arr3by3[2][2] = 3;

        System.out.println(Arrays.toString(arr3by3[0]));
        System.out.println(Arrays.toString(arr3by3[1]));
        System.out.println(Arrays.toString(arr3by3[2]));

        int[][] arr10by10 = new int[10][10]; // 배열 선언과 초기화

        for (int i = 0 ; i < 10 ; i++){
            System.out.println(Arrays.toString(arr10by10[i]));
        }

    }
}
