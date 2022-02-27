package com.practiceset7;

import java.util.Scanner;

public class PracticeSetQuestion5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number upto which Fibonacci series to print: ");
        int number = in.nextInt();
        System.out.print("Fibonacci series upto " + number + " numbers : "); //
        for (int i = 1; i <= number; i++) {
            System.out.print(fibonacci(i) + " ");

        }
        int result = fibonacci(number);
        System.out.print("\nAt " + number + " position the number in fibonacci series is: " + result);
    }

    static int fibonacci(int number) {
        if(number == 1 || number == 2) {
            return number-1;
        }
        return fibonacci(number-1) + fibonacci(number -2);
    }
}
