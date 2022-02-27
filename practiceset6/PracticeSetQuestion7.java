package com.practiceset6;

public class PracticeSetQuestion7 {
    public static void main(String[] args) {
        int[] arr = {-1, 21, 3, 45, 5, 34, 67};
        int min=Integer.MAX_VALUE;
        for(int element: arr){
            if(element<min){
                min = element;
            }
        }
        System.out.println("The value of the minimum element in this array is: " + min);
    }
}
