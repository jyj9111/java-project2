package com.example.javaproject2.week1.day5;

public class PointTest {
    public static void main(String[] args) {
        // 0, 0의 점 만들기
        Point p1 = new Point();
        p1.x = 0;
        p1.y = 0;
        System.out.printf("x:%d, y:%d\n", p1.x,p1.y);
        System.out.printf("x와 y가 같은지? %s\n",p1.isSameXy());

        //다른 점 찍기
        Point p2 = new Point();
        p2.x = 2;
        p2.y = 3;
        System.out.printf("x:%d, y:%d\n", p2.x,p2.y);
        System.out.printf("x와 y가 같은지? %s\n",p2.isSameXy());
    }
}
