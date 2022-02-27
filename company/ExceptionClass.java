package com.company;

import java.util.Scanner;

public class ExceptionClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the value of a: ");
//        int a = in .nextInt();
//        if(a<100){
//            try{
//                 throw new MyException();
//                 // throw new ArithmeticException("This is a Arithmetic exception");
//            }
//            catch (Exception e){
//                System.out.println(e.getMessage());
//                System.out.println(e.toString());
//                // System.out.println(e); // this will automatically call toString method
//                e.printStackTrace();
//            }
//            System.out.println("Program is completed");
//        }


        System.out.print("Enter the age: ");
        int age = in .nextInt();
        if(age>100){
            try{
                throw new MyAgeException();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                // System.out.println(e); // this will automatically call toString method
                e.printStackTrace();
            }
            System.out.println("Program is completed");
        }
    }
}

class MyException extends Exception{
    @Override
    public String toString() {
        return "I am a toString method";
    }

    @Override
    public String getMessage() {
        return "I am a getMessage method";
    }
}

class MyAgeException extends Exception{
    @Override
    public String toString() {
        return "Age cannot be greater than 100";
    }

    @Override
    public String getMessage() {
        return "Make sure that the value of age is entered is positive";
    }
}
