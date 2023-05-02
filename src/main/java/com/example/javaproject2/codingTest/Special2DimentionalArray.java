package com.example.javaproject2.codingTest;

import java.util.Arrays;

public class Special2DimentionalArray {
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                answer[i][j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(3)[2]));
    }
}
