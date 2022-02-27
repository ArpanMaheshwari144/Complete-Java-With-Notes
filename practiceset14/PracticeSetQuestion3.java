package com.practiceset14;

import java.util.Scanner;

public class PracticeSetQuestion3 {
    public static void main(String[] args) {
        boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 70;
        marks[1] = 79;
        marks[2] = 89;
        Scanner in = new Scanner(System.in);
        int index;
        int i = 0;
        while(flag && i < 5){
            try {
                System.out.print("Enter the array index: ");
                index = in.nextInt();
                System.out.println("The value is: " + marks[index]);
                break;
            }
            catch(Exception e){
                System.out.println("Invalid index");
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error");
        }
    }
}
