package com.company;

import java.awt.*;
import java.util.Scanner;

public class TakingUserInput {
    public static void main(String[] args) {
        System.out.println("Taking User Input");
        Scanner in = new Scanner(System.in);

//        System.out.print("Enter 1st number: ");
//        int a = in.nextInt();
//        System.out.print("Enter 2nd number: ");
//        int b = in.nextInt();
//        int sum = a + b;
//        System.out.println("The sum of thses numbers are: " + sum);

//        System.out.print("Enter 1st number in a decimal value: ");
//        float a = in.nextFloat();
//        System.out.print("Enter 2nd number in a decimal value: ");
//        float b = in.nextFloat();
//        float sum = a + b;
//        System.out.println("The sum of thses numbers are: " + sum);

//        System.out.print("Enter a number: ");
//        boolean b1 = in.hasNextInt();  // this will check whether a number is integer or not
//        System.out.println(b1);

//        System.out.print("Enter a string: ");
//        String str = in.next();  // this will read whole string if space is encounter this will terminate ths string
//        System.out.println(str);

        System.out.print("Enter a string: ");
        String str = in.nextLine();  // this will read whole string if space is encounter this will not terminate ths string
        System.out.println(str);



    }
}
