package com.example.javaproject2.week7.day2;

import java.util.ArrayList;
import java.util.List;

public class CMath {
    private static List<Integer> factorsOf(int num) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < num; i++) {
            if(num % i == 0)
                numbers.add(i);
        }
        return numbers;
    }

    public static boolean isPrime(int num) {
        return factorsOf(num).size() == 1;
    }
    public static boolean isPerpectionNumber(int num) {
        List<Integer> numbers = factorsOf(num);
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if(num % i == 0)
                numbers.add(i);
        }

        for (int i = 0; i < numbers.toArray().length; i++) {
            sum += numbers.get(i);
        }
        return sum == num;
    }
    public static String factors(int num) {
        return factorsOf(num).toString();
    }
}
