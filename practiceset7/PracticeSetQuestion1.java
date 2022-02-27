package com.practiceset7;

import java.util.Scanner;

public class PracticeSetQuestion1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to print the multiplication table: ");
        int n = in.nextInt();
        multiplication(n);
    }

    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }
}
