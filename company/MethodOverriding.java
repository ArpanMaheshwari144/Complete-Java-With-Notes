package com.company;

class A{
    public void display1(){
        System.out.println("This is a method1 of class A");
    }

    public void display2(){
        System.out.println("This is a method2 of class A");
    }
}
class B extends A{
    @Override
    public void display2() {
        System.out.println("This is a method2 of class B");
    }
    public void display3() {
        System.out.println("This is a method3 of class B");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.display1();
        obj1.display2();

        System.out.println("===================================");

        B obj2 = new B();
        obj2.display1();
        obj2.display2();
        obj2.display3();
    }
}
