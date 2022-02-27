package com.practiceset14;

public class PracticeSetQuestion2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Haha");
        }
        catch(IllegalArgumentException e){
            System.out.println("Hehe");
        }
    }
}
