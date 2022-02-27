package com.practiceset6;

public class PracticeSetQuestion3 {
    public static void main(String[] args) {
        float[] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        int n = marks.length;
        float sum = 0;
        for(float mark : marks){
            sum = sum + mark;
        }
        System.out.println("The Average marks is: " + sum/n);
    }
}
