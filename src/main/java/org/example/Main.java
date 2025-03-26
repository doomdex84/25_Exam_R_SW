package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {           // 정수 i가 n보다 작으면 i 가 증가
            for (int j = 0; j < i; j++) {         // 정수 j가 정수 i보다 작다면 j증가하여 공백으로 표기되도록 함수를 만든다.
                System.out.print(" ");
            }
            for (int j = n-i; j > 0; j--) {
                System.out.print(j + " ");    //숫자를 역순으로 보여주기 위하여 
            }
            System.out.println();
        }
    }
}
 