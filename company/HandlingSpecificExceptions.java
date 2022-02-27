package com.company;

import java.util.Scanner;

public class HandlingSpecificExceptions {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 50;
        marks[1] = 66;
        marks[2] = 78;
        marks[3] = 72;
        marks[4] = 89;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the array index: ");
        int index = in.nextInt();
        System.out.print("Enter the number you want to divide the value with: ");
        int number = in.nextInt();

        try {
            System.out.println("The value at array index entered is: " + marks[index]);
            System.out.println("The value of array-value/number is: " + marks[index]/number);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occurred");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurred");
        }
        catch(Exception e){
            System.out.println("Some other exception occurred: " + e);
        }
    }
}
