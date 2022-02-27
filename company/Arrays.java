package com.company;

public class Arrays {
    public static void main(String[] args) {
        // There are three main ways to create an array in Java
        // 1. Declaration and memory allocation
        /*int[] marks = new int[5];
        marks[0] = 44;
        marks[1] = 64;
        marks[2] = 89;
        marks[3] = 77;
        marks[4] = 54;
        System.out.println(marks[2]);*/


        // 2. Declaration and then memory allocation
        /*int[] marks;
        marks = new int[5];
        marks[0] = 44;
        marks[1] = 64;
        marks[2] = 89;
        marks[3] = 77;
        marks[4] = 54;
        System.out.println(marks[2]);*/


        // 3. Declaration, memory allocation and initialization
        int[] marks = {44, 64, 89, 77, 54};
        System.out.println(marks[2]);
    }
}
