package com.practiceset7;

import java.util.Scanner;

public class PracticeSetQuestion8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to print the pattern: ");
        int n = in.nextInt();
        pattern_recursion(n);

    }

    // pattern_recursive(3)
    // pattern_recursive(2) + 3 times star and new line
    // pattern_recursive(1) + 2 times star and new line + 3 times star and new line
    // pattern_recursive(0) + 1 times star and new line + 2 times star and new line + 3 times star and new line
    static void pattern_recursion(int n) {
        if (n > 0) {
            pattern_recursion(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
