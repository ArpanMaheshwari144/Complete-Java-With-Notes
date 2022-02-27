package com.company;

public class ThrowAndThrows {
    public static int divide(int a, int b) throws ArithmeticException{
        return a / b;
    }
    public static double area(int radius) throws NegativeRadiusException{
        if(radius<0){
            throw new NegativeRadiusException();
        }
        return Math.PI*radius*radius;
    }
    public static void main(String[] args) {
        try{
            int c = divide(6, 0);
            System.out.println("The result is: " + c);
        }
        catch(Exception e){
            System.out.println("Exception occurred");
        }

        try{
            double calculateArea = area(-12);
            System.out.println("The area is: " + calculateArea);
        }
        catch(Exception e){
            System.out.println("Exception occurred");
        }
    }
}

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative!!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!!";
    }
}
