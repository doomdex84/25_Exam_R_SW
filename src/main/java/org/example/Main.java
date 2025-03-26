package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();


        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i < n; i++) {   // 정수i가 정수 n보다 작으면 i증가하고
            System.out.print(num1 + " ");   // 정수 num1은 0부터 증가 한다.
            int sum = num1 + num2;  // 정수 sum은 num1이 0부터 증가하고 정수 num2 는 기본 1이 값이여서 0+1부터 시작
            num1 = num2; // num2 가 1일때 num1 도 1로 받는다.
            num2 = sum;  // num2 는 sum의 값을 받아서 다음 정수 n수까지 반복한다.

        }
    }
}