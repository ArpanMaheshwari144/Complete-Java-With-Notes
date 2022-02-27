package com.practiceset4;

import java.util.Scanner;

public class PracticeSetQuestion4 {
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of a day: ");
        int day = in.nextInt();
        switch (day){
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Invalid Input!!");
        }*/

                  // OR

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of a day: ");
        int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("Today is Monday");
            case 2 -> System.out.println("Today is Tuesday");
            case 3 -> System.out.println("Today is Wednesday");
            case 4 -> System.out.println("Today is Thursday");
            case 5 -> System.out.println("Today is Friday");
            case 6 -> System.out.println("Today is Saturday");
            case 7 -> System.out.println("Today is Sunday");
            default -> System.out.println("Invalid Input!!");
        }
    }
}
