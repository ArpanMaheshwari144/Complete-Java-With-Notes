package com.company;

import java.util.*;

public class MyHashSet {
    public static void main(String[] args) {
        // construct a new hashset with default initial capacity is 16 and load factor 0.75
        // HashSet<Integer> hs1 = new HashSet<>();

        // construct a new hashset with initial capacity is 6 and load factor 0.5f(float)
        HashSet<Integer> hs2 = new HashSet<>(6, 0.5f);
        hs2.add(6);
        hs2.add(8);
        hs2.add(3);
        hs2.add(11);
        hs2.add(11);
        // System.out.println(hs2.size());
        System.out.println(hs2.contains(6));
        System.out.println(hs2.contains(60));
        System.out.println(hs2);

    }
}
