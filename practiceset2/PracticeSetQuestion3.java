package com.practiceset2;

import java.util.Scanner;

public class PracticeSetQuestion3 {
    public static void main(String[] args) {
        /*Ques3-> Use comparison operators to find out whether a given number is greater than                   the user entered number or not.*/

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.println(n > 10);
    }
}
