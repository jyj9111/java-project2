package com.example.javaproject2.week7;

public class Game369ByString {
    public static void main(String[] args) {
        game369();
    }

    private static void game369() {
        String result = "";
        for (int i = 0; i < 100; i++) {
            result = i + "";
            int cnt3 = result.length() - result.replace("3","").length();
            int cnt6 = result.length() - result.replace("6","").length();
            int cnt9 = result.length() - result.replace("9","").length();
            int total = cnt3 + cnt6 + cnt9;

            System.out.println(result + "*".repeat(total));
        }
    }
}
