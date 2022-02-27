package com.practiceset6;

public class PracticeSetQuestion1 {
    public static void main(String[] args) {
        float[] arr = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum=0;
        for (float element : arr) {
            sum = sum + element;
        }
        System.out.println("The sum of the array is: " + sum);
    }
}
