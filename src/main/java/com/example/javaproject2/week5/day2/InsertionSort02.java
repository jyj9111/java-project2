/*package com.example.javaproject2.week5.day2;

import java.util.Arrays;

public class InsertionSort02<T> {

    //기본 : 오름차순 신호시 : 내림차순
    public T[] sort(T[] arr, boolean isAscending) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 ; j--) {
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
    public T[] sort(T[] arr) {
        return sort(arr, true);
    }
    public static void main(String[] args) {
//        int[] arr = {7, 2, 3, 9, 28, 11};
        Character[] cArr = {'f', 'g', 'a', 'c', 'b'};

        InsertionSort02 is = new InsertionSort02();
        arr = is.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}*/
