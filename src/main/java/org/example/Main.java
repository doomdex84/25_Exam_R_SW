package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String i = "*";

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int x = 0; x <= a; x++) {
            System.out.println(i);
        }
        for (int y = 0; y <= b; y++) {
           System.out.println(i);
        }
    }

}


