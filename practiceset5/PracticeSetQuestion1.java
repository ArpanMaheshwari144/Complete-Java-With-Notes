package com.practiceset5;

import java.util.Scanner;

public class PracticeSetQuestion1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to print the star pattern: ");
        int n = in.nextInt();
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
