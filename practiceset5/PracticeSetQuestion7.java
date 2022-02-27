package com.practiceset5;

import java.util.Scanner;

public class PracticeSetQuestion7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to print the star pattern: ");
        int n = in.nextInt();
        int i=1;
        int j;
        while(i<=n){
            j = i;
            while(j<=n){
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.print("\n");

        }
    }
}
