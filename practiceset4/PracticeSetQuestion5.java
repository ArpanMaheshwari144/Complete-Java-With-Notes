package com.practiceset4;

import java.util.Scanner;

public class PracticeSetQuestion5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = in.nextInt();
        boolean isLeap = false;
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isLeap = true;
                }
                else {
                    isLeap = false;
                }
            }
            else {
                isLeap = true;
            }
        }
        else {
            isLeap = false;
        }
        if(isLeap==true){
            System.out.println(year + " is a Leap Year.");
        }
        else{
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
