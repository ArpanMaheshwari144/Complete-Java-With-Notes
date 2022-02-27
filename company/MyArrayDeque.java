package com.company;

import java.util.*;

public class MyArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(10);
        ad1.add(20);
        ad1.add(30);
        ad1.addFirst(5);
        ad1.addLast(40);
        // System.out.println(ad1.getFirst());
        // System.out.println(ad1.getLast());

        // Printing all the elements in ArrayDeque
        // System.out.println(ad1);

        // In ArrayDeque we use enhanced for-loop
        for (Integer i : ad1) {
            System.out.println("Element is " + i);
        }
    }
}
