package com.practiceset5;

import java.util.Scanner;

public class PracticeSetQuestion4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to print the multiplication table in a reverse manner: ");
        int n = in.nextInt();
        for(int i=10;i>=1;i--){
            //System.out.println(n + " X " + i + " = " + n*i);
            System.out.printf("%d X %d = %d\n", n, i, n*i);
        }
    }
}
