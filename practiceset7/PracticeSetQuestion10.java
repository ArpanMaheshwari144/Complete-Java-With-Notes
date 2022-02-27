package com.practiceset7;

import java.util.Scanner;

public class PracticeSetQuestion10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to print the sum of natural numbers: ");
        int n = in.nextInt();
        System.out.println("The sum of first " + n + " natural numbers are: " + sum_iterative(n));

    }

    static int sum_iterative(int n){
        int sum = 0;
        for(int i=1; i<=n;i++) {
            sum += i;
        }
        return sum;
    }
}
