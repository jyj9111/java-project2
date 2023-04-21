package com.example.javaproject2.week1.day5;

public class SpaceInvader {
   private void moveLeft() {
       int location = 0;
       location = -1;
       System.out.printf("move left: %d ", location);
   }
   private void moveRight() {
       int location = 0;
       location = 1;
       System.out.printf("move right: %d ", location);
   }

    public static void main(String[] args) {
        SpaceInvader si = new SpaceInvader();
        si.moveLeft();
        si.moveRight();
    }
}