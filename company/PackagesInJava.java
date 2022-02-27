package com.company;

//import java.util.Scanner;  // it will import only Scanner class from the util package
//import java.util.*; // it will import all the classes from util package

public class PackagesInJava {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }
}
