package com.example.javaproject2.week5.day2;

import java.util.Arrays;

public class InsertionSort01 {
    //기본 : 오름차순 신호시 : 내림차순
    public int[] sort(int[] arr, boolean isAscending) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 ; j--) {
                System.out.printf("i:%d j:%d\n", i, j);
                if((isAscending ? arr[j - 1] - arr[j] : arr[j] - arr[j - 1])> 0 ) { //오름차순
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else
                    break;
            }
        }
        return arr;
    }
    public int[] sort(int[] arr) {
        return sort(arr, true);
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};
        InsertionSort01 is = new InsertionSort01();
        arr = is.sort(arr, false);
        System.out.println(Arrays.toString(arr));
    }
}
