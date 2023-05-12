package com.example.javaproject2;

import java.io.*;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> cloneStack;

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            stack.push(Integer.parseInt(br.readLine()));
        }
        int count = 0;
        int current = 0;
        int next = 0;
        int previous = 0;

        while (!stack.isEmpty()) {
            cloneStack = (Stack<Integer>) stack.clone();

            current = cloneStack.pop(); // 비교할 숫자 pop
            if(current < cloneStack.peek()) { // 바로 옆사람 밖에 못본다
                count++;
                previous = current;
            } else {
                int size = cloneStack.size();
                for (int i = 0; i < size; i++) {
                    int temp = cloneStack.pop();

                    if(!cloneStack.isEmpty() && temp > cloneStack.peek()) {
                        count++;
                        break;
                    } else count++;
                }
            }
            /*if(!cloneStack.isEmpty())*/
            stack = (Stack<Integer>) cloneStack.clone();
        }
        bw.append(Integer.toString(count));
        bw.flush();

        br.close();
        bw.close();
    }
}