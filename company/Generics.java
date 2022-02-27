package com.company;

import java.util.ArrayList;

class MyGeneric<T1, T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public T1 getT1() {
        return t1;
    }

    public T2 getT2() {
        return t2;
    }
}

public class Generics {
    public static void main(String[] args) {
        MyGeneric<String, Integer> g1 = new MyGeneric(23, " MyString is my string ", 45);
        String str = g1.getT1();
        Integer int1 = g1.getT2();
        Integer int2 = g1.getVal();
        System.out.println(int2 + str + int1);
    }
}
