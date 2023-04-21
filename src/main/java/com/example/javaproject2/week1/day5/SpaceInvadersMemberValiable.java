package com.example.javaproject2.week1.day5;

public class SpaceInvadersMemberValiable {
    int location;

    public void moveLeft(){
        location = location - 1;
    }
    public void moveRight(){
        location = location + 1;
    }

    public static void main(String[] args) {
        SpaceInvadersMemberValiable sim = new SpaceInvadersMemberValiable();
        sim.moveLeft();
        sim.moveRight();
        sim.moveRight();
        sim.moveRight();

        System.out.printf("최종위치 : %d\n",sim.location);
        sim.moveLeft();
        System.out.printf("최종위치 : %d\n",sim.location);
    }
}
