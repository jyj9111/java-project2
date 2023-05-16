package com.example.javaproject2.week5.day1;

import java.util.Arrays;

public class BubbleSort02 {
    public int[] sort(int[] arr, boolean isDescending) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(isDescending) {
                    if (arr[i] < arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                } else {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        BubbleSort02 bubbleSort02 = new BubbleSort02();
        int[] arr = {7, 2, 3, 9, 28, 11};

        arr = bubbleSort02.sort(arr, true);

        System.out.println(Arrays.toString(arr));
        System.out.println(0.5);
    }
}
