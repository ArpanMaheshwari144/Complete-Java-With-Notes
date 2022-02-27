package com.company;

public class Arrays1 {
    public static void main(String[] args) {
        /*int[] marks = {44, 64, 89, 77, 54};
        System.out.println(marks[2]);
        System.out.println(marks.length);*/


        /*float[] marks = {98.5f, 45.5f, 79.5f, 99.5f, 80.5f};
        System.out.println(marks[2]);
        System.out.println(marks.length);*/


        /*String[] students = {"Arpan", "Adarsh", "Verma", "Patra"};
        System.out.println(students[2]);
        System.out.println(students.length);*/


        int[] marks = {44, 64, 89, 77, 54};
        // Displaying the Array (Naive way)
        /*System.out.println("Printing using Naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);*/

        // Displaying the Array (for loop)
        /*System.out.println("Printing using for loop");
        for(int i=0;i<marks.length;i++){
            System.out.println("Index " + i + " = " + marks[i]);
        }*/

        // Displaying the Array (decrementing for loop)
        /*System.out.println("Printing using For loop in reverse order");
        for(int i=marks.length-1;i>=0;i--){
            System.out.println("Index " + i + " = " + marks[i]);
        }*/

        // Displaying the Array (for-each loop)
        System.out.println("Printing using For-Each loop");
        int index = 0;
        for(int elements : marks){
            System.out.println("Index " + index + " = " + elements);
            index++;
        }
    }
}
