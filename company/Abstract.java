package com.company;

public class Abstract {
    public static void main(String[] args) {
        Parent2 obj1 = new Child2();
        obj1.greet1();
        obj1.greet2();
        obj1.sayHello();

        Child2 obj2 = new Child2();
        obj2.greet1();
        obj2.greet2();

        Child3 obj3 = new Child4();
        obj3.greet1();
        obj3.greet2();
        obj3.sayHi();
    }
}

abstract class Parent2{
    public Parent2(){
        System.out.println("I am a constructor of Parent2 class");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet1();
    abstract public void greet2();
}

class Child2 extends Parent2{
    @Override
    public void greet1() {
        System.out.println("Good Morning");
    }
    @Override
    public void greet2() {
        System.out.println("Good Afternoon");
    }
}

abstract class Child3 extends Parent2{
    abstract public void sayHi();
}

class Child4 extends Child3{
    @Override
    public void greet1() {
        System.out.println("Good Evening");
    }
    @Override
    public void greet2() {
        System.out.println("Good Night");
    }
    @Override
    public void sayHi() {
        System.out.println("Hii");
    }
}