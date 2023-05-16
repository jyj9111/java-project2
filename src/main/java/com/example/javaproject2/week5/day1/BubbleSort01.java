package com.example.javaproject2.week5.day1;

import java.util.Arrays;

public class BubbleSort01 { //버블정렬
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 1};
        System.out.println(Arrays.toString(arr));
        for (int j = 1; j <= arr.length; j++) {
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            System.out.printf("%d: %s\n", j, Arrays.toString(arr));
        }
    }
}
