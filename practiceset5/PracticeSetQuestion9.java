package com.practiceset5;

import java.util.Scanner;

public class PracticeSetQuestion9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to print the multiplication table: ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + (n*i);
        }
        System.out.println("The sum of table " + n + " is: " + sum);
    }
}
