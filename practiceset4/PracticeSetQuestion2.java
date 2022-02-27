package com.practiceset4;

import java.util.Scanner;

public class PracticeSetQuestion2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks in subject1: ");
        float sub1 = in.nextFloat();
        System.out.print("Enter your marks in subject2: ");
        float sub2 = in.nextFloat();
        System.out.print("Enter your marks in subject3: ");
        float sub3 = in.nextFloat();

        float total = (sub1 + sub2 + sub3)*100/300;
        System.out.println("Your overall percentage is " + total);

        if(total >= 40 && sub1 >= 33 && sub2 >= 33 && sub3 >= 33){
            System.out.println("Congratulations, You have been promoted!!");
        } else {
            System.out.println("Sorry, You have not been promoted!!");
        }
    }
}
