package com.example.javaproject2.week7;

public class Game369 {
    public static void main(String[] args) {
//        game369(0, 99);
        game369Ex();
    }

    private static void game369Ex() {
        int cnt = 333;
        String result = is369(cnt);
        System.out.println(cnt + result);
    }

    public static void game369(int st , int range) {
        String result = "";

        for (int i = st; i <= range; i++) {
            result = i + "";
            int value = i;

            while(value > 0) {
                int temp = value % 10;
                if(temp == 3 || temp == 6 || temp == 9)
                    result += "*";
                value /= 10;
            }

            System.out.println(result);
        }
    }

    public static String is369(int cnt) {
        int num1 = cnt / 10;
        int num2 = cnt % 10;
        String result = (num2 % 3 == 0 && num2 != 0) ? "*" : "";

        if(num1 == 0)
            return result;

        return result + is369(num1);
    }
}
