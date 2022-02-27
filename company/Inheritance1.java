package com.company;

public class Inheritance1 {
    public static void main(String[] args) {

        // Creating an object of Animal Class
        Animal a = new Animal();
        a.eat();
        a.sleep();
        a.run();

        System.out.println("===========================================");

        // Creating an object of Dog Class
        Dog d = new Dog();
        d.eat();
        d.sleep();
        d.run();
        d.bark();
    }
}

class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }

    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public void run(){
        System.out.println("Animal is running");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("Dog is barking");
    }
}
