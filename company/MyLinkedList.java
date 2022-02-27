package com.company;

import java.util.*;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0,5);
        l1.add(0,1);

        l2.add(10);
        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);
        l2.add(15);

        // l1.addAll(l2);
        l1.addAll(0,l2); // add all elements of l2 to the 0th index
        l1.addFirst(100);
        l1.addLast(200);

        // l1.clear();

        // System.out.println(l1.contains(7));
        // System.out.println(l1.contains(27));

        // System.out.println(l1.indexOf(7));
        // System.out.println(l1.indexOf(6));
        // System.out.println(l1.lastIndexOf(6));

         // l1.set(1, 50);

        // System.out.println(l1.isEmpty());

        for(int i=0;i<l1.size();i++){
            System.out.println("Index is " + i + " and element is " + l1.get(i));
        }
    }
}
