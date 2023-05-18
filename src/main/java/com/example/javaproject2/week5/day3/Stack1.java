package com.example.javaproject2.week5.day3;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack1 {

    private int[] arr = new int[10_000];
    private int pointer = 0;

    public void push(int value) {
        this.arr[this.pointer++] = value;
//        System.out.println(Arrays.toString(arr));
//        System.out.printf("pointer: %d\n", this.pointer);
    }

    public int pop() {
        if(isEmpty()) throw new RuntimeException("스택이 비었습니다.");
        return this.arr[--this.pointer];
    }

    public boolean isEmpty() {
        return this.pointer == 0;
    }

    public int peek() {
        if (isEmpty()) throw new EmptyStackException();
        return this.arr[this.pointer - 1];
    }
    public static void main(String[] args) {
        Stack1 stack1 = new Stack1();

//        stack1.push(10);
//        stack1.push(20);
        System.out.println(stack1.peek());
    }
}
