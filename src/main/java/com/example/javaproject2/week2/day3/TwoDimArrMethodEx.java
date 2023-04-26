package com.example.javaproject2.week2.day3;

import java.util.Arrays;

public class TwoDimArrMethodEx {
    public static void fillARow(int[][] arr, int row, int column){
        for (int i = 0 ; i < column ; i++){
            arr[row][i] = 1;
        }
    }
    public static void fillAColumn(int[][] arr, int row, int column){
        for (int i = 0 ; i < row ; i++){
            arr[i][column] = 1;
        }
    }
    public static void printArr(int[][] arr, int row){
        for (int i = 0 ; i < row ; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("----------");
    }
    public static void main(String[] args) {
        int[][] arr1 = new int[5][5];
        printArr(arr1, 5);
        fillARow(arr1, 5, 5);
        printArr(arr1, 5);
    }
}
