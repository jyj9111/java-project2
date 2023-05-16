package com.example.javaproject2.week5.day1;

import java.util.Arrays;

public class BubbleSortOOP { //버블정렬 with.OOP
    public int[] sortARound(int[] arr, int until) {
        for (int i = 0; i < arr.length - until; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return arr;
    }

    public int[] sort(int[] arr){
        for (int i = 1; i <= arr.length; i++) {
            sortARound(arr, i);
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSortOOP bubbleSortOOP = new BubbleSortOOP();

        int[] arr = {7, 2, 3, 9, 28, 1};

        arr = bubbleSortOOP.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
