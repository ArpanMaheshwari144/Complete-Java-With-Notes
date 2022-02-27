package com.company;

interface Demo{
    void myMethod1(int a);
}

public class LambdaExpression {
    public static void main(String[] args) {
        // Anonymous Class
//        Demo obj  = new Demo() {
//            @Override
//            public void myMethod1() {
//                System.out.println("My Method1");
//            }
//        };
//        obj.myMethod1();

        // Lambda Expression
        Demo obj1 = (a)->{System.out.println("Method1 " + a);};
        obj1.myMethod1(4);
    }
}
