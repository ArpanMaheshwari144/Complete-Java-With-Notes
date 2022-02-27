package com.practiceset6;

public class PracticeSetQuestion5 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7};

//        This is not reversing the array but printing the array in reverse order.
//        int n = arr.length-1;
//        for(int i=n; i>=0; i--){
//            System.out.print(arr[i] + " ");
//        }

        int l = arr.length;
        int n = Math.floorDiv(l, 2); // it returns 3.55 to 3
        int temp;

        for(int i=0; i<n; i++){
            // Swap a[i] and a[l-1-i]
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }

        System.out.print("The elements of the array in reverse order are: ");
        for(int element: arr){
            System.out.print(element + " ");
        }
    }
}
