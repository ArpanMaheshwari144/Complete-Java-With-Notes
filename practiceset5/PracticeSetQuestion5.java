package com.practiceset5;

import java.util.Scanner;

public class PracticeSetQuestion5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int n = in.nextInt();
        int factorial = 1;
        for(int i=1;i<=n;i++){
            factorial = factorial * i;
        }
        System.out.println("The factorial of " + n + " is: " + factorial);
    }
}
