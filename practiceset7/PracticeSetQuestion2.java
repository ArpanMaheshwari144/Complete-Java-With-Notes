package com.practiceset7;

import java.util.Scanner;

public class PracticeSetQuestion2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to print the pattern: ");
        int n = in.nextInt();
        pattern(n);
    }

    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
