package com.example.javaproject2.week2.day3;

import java.util.Arrays;

public class SwapEx {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 8, 7, 6};

        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        temp = arr[3];
        arr[3] = arr[5];
        arr[5] = temp;

        System.out.println(Arrays.toString(arr));
    }
}