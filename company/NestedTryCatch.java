package com.company;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 50;
        marks[1] = 66;
        marks[2] = 78;
        marks[3] = 72;
        marks[4] = 89;
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("Enter the array index: ");
            int index = in.nextInt();
            try {
                System.out.println("Welcome");
                try {
                    System.out.println(marks[index]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exists");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Thanks for using this program");
    }
}
