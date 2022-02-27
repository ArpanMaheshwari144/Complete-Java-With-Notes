package com.practiceset12;

import java.lang.Math;

public class PracticeSetQuestion1 {
    public static void main(String[] args) {
        Calculator obj1 = new Calculator();
        obj1.calculate1(2,3);

        System.out.println("====================");

        ScientificCalculator obj2 = new ScientificCalculator();
        obj2.calculate2(4,5);

        System.out.println("====================");

        HybridCalculator obj3 = new HybridCalculator();
        obj3.calculate3(8,9);
    }
}

class Calculator{
    public void calculate1(int a, int b){
        System.out.println("Result is: " + (a + b));
    }
}

class ScientificCalculator{
    public void calculate2(int a, int b){
        System.out.println("Result is: " + Math.sin(a + b));
        System.out.println("Result is: " + Math.cos(a + b));
    }
}

class HybridCalculator{
    public void calculate3(int a, int b){
        System.out.println("Result is: " + (a + b));
        System.out.println("Result is: " + (a - b));
        System.out.println("Result is: " + Math.sin(a + b));
        System.out.println("Result is: " + Math.cos(a + b));
    }
}