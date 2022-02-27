package com.company;

import java.util.Scanner;

public class CalculatePercentage {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the marks of subject 1 out of 100: ");
        float sub1 = in.nextFloat();
        System.out.print("Enter the marks of subject 2 out of 100: ");
        float sub2 = in.nextFloat();
        System.out.print("Enter the marks of subject 3 out of 100: ");
        float sub3 = in.nextFloat();
        System.out.print("Enter the marks of subject 4 out of 100: ");
        float sub4 = in.nextFloat();
        System.out.print("Enter the marks of subject 5 out of 100: ");
        float sub5 = in.nextFloat();

        float total  = sub1 + sub2 + sub3 + sub4 + sub5;
        float percentage = ((total)*100)/500;
        System.out.println("Total Marks is " + total + " Out of 500");
        System.out.print("Total Percentage is: " + percentage  + "%");
    }
}
