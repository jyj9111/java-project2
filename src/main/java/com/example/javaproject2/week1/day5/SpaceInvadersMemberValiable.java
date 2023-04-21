package com.example.javaproject2.week1.day5;

public class SpaceInvadersMemberValiable {
    int location;

    public void moveLeft(){
        location = location - 1;
        System.out.printf("moveLeft: %d\n",location);
    }
    public void moveRight(){
        location = location + 1;
        System.out.printf("moveRight: %d\n",location);
    }

    public static void main(String[] args) {
        SpaceInvadersMemberValiable sim = new SpaceInvadersMemberValiable();
        sim.moveLeft();
        sim.moveRight();
        sim.moveRight();
        sim.moveRight();
    }
}
