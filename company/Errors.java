package com.company;

public class Errors {
    public static void main(String[] args) {
        // SYNTAX ERROR DEMO
        // int a = 5 // Error: no semicolon
        // b = 4 // -> Error: b is not declared
        int c = 10;
        System.out.println(c);

        System.out.println("==============================================");

        // LOGICAL ERROR DEMO
        // Write a program to print all prime numbers between 1 to 10
        System.out.println(2);
        for(int i=1;i<5;i++){
            System.out.println(2*i+1);
        }

        System.out.println("==============================================");

        // RUNTIME ERROR DEMO
        // System.out.println(1000/0); // Error: 1000 cannot divide by 0

    }
}
