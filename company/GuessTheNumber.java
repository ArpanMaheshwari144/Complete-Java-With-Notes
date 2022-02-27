package com.company;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b) {
            g.takeUserInput();
            b = g.isCorrect();
        }
    }
}

class Game{
    public int number;
    public int inputNumber;
    public int numberOfGuesses = 0;

    public Game(){
        Random rand = new Random();
        number = rand.nextInt(100);
    }

    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }

    public void setNumberOfGuesses(int numberOfGuesses) {
        this.numberOfGuesses = numberOfGuesses;
    }

    void takeUserInput(){
        Scanner in = new Scanner(System.in);
        System.out.print("Guess a number from 0 to 100: ");
        inputNumber = in.nextInt();
    }

    boolean isCorrect(){
        numberOfGuesses++;
        if(inputNumber == number){
            System.out.format("Yes, You guessed it right, it was %d\nYou guessed it in %d attempts ", number, numberOfGuesses);
            return true;
        }
        else if(inputNumber < number){
            System.out.println("Your Guess is too less...");
        }
        else if(inputNumber > number){
            System.out.println("Your Guess is too high...");
        }
        return false;
    }
}


