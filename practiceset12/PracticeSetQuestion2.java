package com.practiceset12;

import java.util.Scanner;

public class PracticeSetQuestion2 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.takeUserInput();
    }
}

class MyClass{
    public void takeUserInput(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String msg = in.nextLine();
        System.out.println("Your message is " + msg);
    }
}