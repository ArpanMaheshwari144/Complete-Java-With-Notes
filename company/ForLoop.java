package com.company;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

//        for(int i=1;i<=10;i++){
//            System.out.println("i = " + i);
//        }


//        Wap to print first n odd numbers using a for loop
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the value where till you want to print the natural numbers: ");
//        int n = in.nextInt();
//        System.out.print("The first " + n + " natural numbers are: ");
//        for(int i=0;i<n; i++){
//            System.out.print(2*i+1 + " ");
//        }


//        Decrementing for loop
//        for(int i=5;i>0;i--){
//            System.out.println("i = " + i);
//        }


//        for(int i=5;i>=0;i--){
//            System.out.println("i = " + i);
//        }


//        for(int i=5;i!=0;i--){
//            System.out.println("i = " + i);
//        }


//      Wap to print first n natural numbers in reverse order using a for loop
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value where till you want to print the odd numbers in reverse order: ");
        int n = in.nextInt();
        System.out.print("The first " + n + " natural numbers in reverse order are: ");
        for(int i=n;i>=0;i--){
            System.out.print(i + " ");
        }
    }
}
