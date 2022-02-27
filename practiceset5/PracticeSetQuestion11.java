package com.practiceset5;

import java.util.Scanner;

public class PracticeSetQuestion11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to print the sum of first even numbers: ");
        int n = in.nextInt();
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + (2*i);
        }
        System.out.println("The sum of first " + n + " even numbers are: " + sum);
    }
}
