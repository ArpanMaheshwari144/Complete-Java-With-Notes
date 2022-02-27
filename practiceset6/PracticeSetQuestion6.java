package com.practiceset6;

public class PracticeSetQuestion6 {
    public static void main(String[] args) {
        int[] arr = {-1, 21, 3, 45, 5, 34, 67};
        int max=Integer.MIN_VALUE;
        for(int element: arr){
            if(element>max){
                max = element;
            }
        }
        System.out.println("The value of the maximum element in this array is: " + max);
    }
}
