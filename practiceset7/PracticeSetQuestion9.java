package com.practiceset7;

import java.util.Scanner;

public class PracticeSetQuestion9 {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        System.out.print("Enter the Temperature you want to convert: ");
        float temp= in.nextFloat();
        float res= conversionTemp(temp);
        System.out.println(temp + "°C" + " = " + res+"°F");

    }

    static float conversionTemp(float n){
        return n*9/5+32f;
    }
}
