package com.example.javaproject2;

import java.io.*;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> saveStack = new Stack<>();
        //입력 1
        int num = Integer.parseInt(br.readLine());
        int idx = num; //탑 번호확인을 위한
        int[] tower = new  int[num + 1];

        //입력 2
        String[] temp = (br.readLine().split(" "));
        for (int i = 0; i < temp.length; i++) {
            stack.push(Integer.parseInt(temp[i]));
        }
        // 처리
        boolean isSave = false;
        // 첫번째 탑 호출
        int preNum = stack.pop();
        idx--;

        while (!stack.isEmpty()) {
           int crnNum = stack.pop();
           if(isSave) {
               int tempNum = saveStack.pop();
               if(crnNum > tempNum) {
                   tower[saveStack.pop()] = idx;
                   if(saveStack.empty()) isSave = false;
               } else {
                   saveStack.push(tempNum);
               }
           }
            if(crnNum > preNum) {
                tower[idx] = idx--;
                preNum = crnNum;
            }
            else {
               saveStack.push(idx);
               saveStack.push(preNum);
               preNum = crnNum;
               idx--;
               isSave = true;
           }
        }
        for (int i = 0; i < num; i++) {
            bw.write(tower[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}