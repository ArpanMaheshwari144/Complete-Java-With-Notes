package com.practiceset1;

import java.util.Scanner;

public class PracticeSetQuestion3 {
    public static void main(String[] args) {
        System.out.print("What is your name: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Hello " + name + " have a good day!");
    }
}
