package com.example.javaproject2.week1.day5;

public class Point {
   int x;
   int y;

   boolean isSameXy(){
      // X와 Y가 같냐?
      return x==y;
   }
   float getDistance(Point p1){
      int xL = p1.x - this.x;
      int yL = p1.y - this.y;

      double temp1 = Math.pow(xL,2);
      double temp2 = Math.pow(yL,2);
      double result = Math.sqrt(temp1+temp2);
      return (float) result;
   }
}
