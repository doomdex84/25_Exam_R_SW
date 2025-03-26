package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
// 별을 찍을때 a는 별의 갯수 b는 칸수를 나타낸다 그리하여 정수 i는 b의 값보다 클때까지 증가하고 정수j또한 a보다 클때까지 증가하면서 별을 찍는다.
//그리하여 마지막에