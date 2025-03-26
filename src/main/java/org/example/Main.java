package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();


        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i < n; i++) {   // 정수i가 정수 n보다 작으면 i증가하고
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;

        }
    }
}
