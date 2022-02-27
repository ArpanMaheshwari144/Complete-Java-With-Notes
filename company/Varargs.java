package com.company;

public class Varargs {
    static int sum(int... arr){
        int result = 0;
        for(int a: arr){
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The sum of 4 and 5 is: " + sum(4, 5));
        System.out.println("The sum of 4, 45 and 55 is: " + sum(4, 45, 55));
        System.out.println("The sum of 4, 45, 55 and 100 is: " + sum(4, 45, 55, 100));
        System.out.println("The sum of 4, 45, 55, 100 and 200 is: " + sum(4, 45, 55, 100, 200));
    }
}
