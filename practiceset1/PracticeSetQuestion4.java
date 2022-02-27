package com.practiceset1;

import java.util.Scanner;

public class PracticeSetQuestion4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter kilometers: ");
        double kilometers = in.nextDouble();
        double miles = kilometers / 1.6;
        System.out.println(kilometers + " Kilometers " + " = " + miles + " Miles");


    }
}
