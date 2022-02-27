package com.practiceset7;

import java.util.Scanner;

public class PracticeSetQuestion3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to print the sum of natural numbers: ");
        int n = in.nextInt();
        System.out.println("The sum of first " + n + " natural numbers are: " + sum_recursive(n));

    }

    // sum(n) = 1 + 2 + 3... + n
    // sum(n) = 1 + 2 + 3... + n-1 + n
    // sum(n) = sum(n-1) + n
    // sum(3) = 3 + sum(2)
    // sum(3) = 3 + 2 + sum(1)
    // sum(3) = 3 + 2 + 1
    static int sum_recursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum_recursive(n - 1);
    }
}
