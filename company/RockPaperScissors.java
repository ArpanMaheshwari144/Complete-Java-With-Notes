package com.company;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 0 for Rock, 1 for Paper and 2 for Scissors: ");
        int userInput = in.nextInt();
        if(userInput > 2){
            System.out.println("Invalid Choice");
            System.exit(0);
        }
        else {
            if(userInput == 0){
                System.out.println("You choose: Rock");
            }
            else if(userInput == 1){
                System.out.println("You choose: Paper");
            }
            else if(userInput == 2) {
                System.out.println("You choose: Scissors");
            }
        }

        Random rand = new Random();
        int computerInput = rand.nextInt(3); // Generate random integers in range 0 to 2

        if(userInput == computerInput){
            System.out.println("Game is Tie");
        }
        else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1){
            System.out.println("You Win");
        }
        else {
            System.out.println("Computer Win");
        }
        if(computerInput == 0){
            System.out.println("Computer choose: Rock");
        }
        else if(computerInput == 1){
            System.out.println("Computer choose: Paper");
        }
        else {
            System.out.println("Computer choose: Scissors");
        }
    }
}
