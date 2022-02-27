package com.company;

public class Inheritance_in_interfaces {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.myMethod1();
        obj.myMethod2();
        obj.myMethod3();
        obj.myMethod4();
    }
}

interface SampleInterface{
    void myMethod1();
    void myMethod2();
}

interface ChildSampleInterface extends SampleInterface{
    void myMethod3();
    void myMethod4();
}

class MyClass implements ChildSampleInterface{
    @Override
    public void myMethod1() {
        System.out.println("Method1");
    }

    @Override
    public void myMethod2() {
        System.out.println("Method2");
    }

    @Override
    public void myMethod3() {
        System.out.println("Method3");
    }

    @Override
    public void myMethod4() {
        System.out.println("Method4");
    }
}
