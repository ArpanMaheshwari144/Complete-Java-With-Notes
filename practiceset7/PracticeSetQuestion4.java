package com.practiceset7;

import java.util.Scanner;

public class PracticeSetQuestion4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to print the pattern: ");
        int n = in.nextInt();
        pattern(n);
    }

    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
