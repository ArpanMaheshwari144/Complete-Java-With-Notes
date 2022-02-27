package com.company;

public class MethodOverloading {
    static void greet(){
        System.out.println("Good Morning!!");
    }

    static void greet(String name){
        System.out.println("Good Morning, " + name);
    }

    static void greet(String fname, String lname){
        System.out.println("Good Morning, " + fname + " " + lname);
    }

    public static void main(String[] args) {
        greet();
        greet("Arpan"); // Arguments are actual
        greet("Arpan", "Maheshwari");
    }
}
