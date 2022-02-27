package com.company;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        // while -> checks the condition and executes the code
        // do-while -> executes the code and then checks the condition

//        int a = 0;
//        while(a<5){
//            System.out.println(a);
//            a++;
//        }


//        int a = 10;
//        while(a<5){
//            System.out.println(a);
//            a++;
//        }


//        int a = 0;
//        do{
//            System.out.println(a);
//            a++;
//        }
//        while(a<5);


//        int a = 10;
//        do{
//            System.out.println(a);
//            a++;
//        }
//        while(a<5);


        // Print first n natural numbers
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number where till you want to print the natural numbers: ");
        int n = in.nextInt();
        int i = 1;
        do{
            System.out.println(i);
            i++;
        } while (i<=n);

    }
}
