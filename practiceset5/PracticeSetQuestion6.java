package com.practiceset5;

import java.util.Scanner;

public class PracticeSetQuestion6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int n = in.nextInt();
        int i = 1;
        int factorial = 1;
        while (i<=n){
            factorial = factorial * i;
            i++;
        }
        System.out.println("The factorial of " + n + " is: " + factorial);
    }
}
