package com.company;

public class Methods1 {
    static void change1(int a){
        a = 98;
    }

    static void change2(int[] arr){
        arr[0] = 98;
    }

    public static void main(String[] args) {
        // Case 1: Changing the Integer
        System.out.println("------------CHANGING THE INTEGER------------");
         int x = 45;
         change1(x);
         System.out.println("The value of x after running change1 method is: " + x);

        // Case 2: Changing the Array
        System.out.println("------------CHANGING THE ARRAY------------");
        int[] marks = {52, 73, 77, 89, 98, 94};
        System.out.println("The marks[0] before running the change2 method: " + marks[0]);
        change2(marks);
        System.out.println("The marks[0] after running the change2 method: " + marks[0]);
    }
}
