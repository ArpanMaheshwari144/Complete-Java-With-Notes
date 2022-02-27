package com.company;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        // Strings are immutable(means once initialized cannot be changed) in java
        // String name1 = new String("Arpan");
        // String name2 = "Arpan";
        // System.out.println(name1);
        // System.out.println(name2);

        // .printf or .format both are same
        // int a = 6;
        // float b = 6.7777665f;
        // System.out.printf("The value of a is %d and the value of b is %f",a,b);
        // System.out.println();
        // System.out.printf("The value of a is %d and the value of b is %.3f",a,b);
        // System.out.println();
        // System.out.printf("The value of a is %d and the value of b is %8.3f",a,b);
        // System.out.println();
        // System.out.format("The value of a is %d and the value of b is %f",a,b);

        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // String name = in.next();  // next() can read the input only till the space
        // System.out.println("Your Beautiful name is " + name);

         Scanner in = new Scanner(System.in);
         System.out.print("Enter your name: ");
         String name = in.nextLine(); // nextLine() reads input including space between the words (that is, it reads till the end of line \n).
         System.out.println("Your Beautiful name is " + name);

    }
}
