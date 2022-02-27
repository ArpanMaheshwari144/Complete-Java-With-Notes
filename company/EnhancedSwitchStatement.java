package com.company;

import java.util.Scanner;

public class EnhancedSwitchStatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        switch (age){
            case 18 ->{
                System.out.println("You are become an adult!");
                System.out.println("You are become an adult and focus on your future!");

            }
            case 23 -> System.out.println("You are going to join a job!");
            case 60 -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy your life");
        }
    }
}
