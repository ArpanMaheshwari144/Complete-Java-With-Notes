package com.practiceset6;

public class PracticeSetQuestion2 {
    public static void main(String[] args) {
        int[] arr = {45, 67, 63, 99, 100};
        int num = 67;
        boolean isInArray = false;
        for(int element : arr){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println(num + " is present in the array");
        } else {
            System.out.println(num + " is not present in the array");
        }
    }
}
