package com.practiceset6;

public class PracticeSetQuestion8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 5};
        boolean isSorted = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
