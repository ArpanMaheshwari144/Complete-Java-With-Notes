package com.practiceset11;

public class PracticeSetQuestion3And5 {
    public static void main(String[] args) {
        Human obj1 = new Human();
        obj1.eat();
        obj1.sleep();
        obj1.jump();
        obj1.bite();
        obj1.speak();

        System.out.println("=============================");

        Monkey obj2 = new Human();
        obj2.jump();
        obj2.bite();

        System.out.println("=============================");

        BasicAnimal obj3 = new Human();
        obj3.eat();
        obj3.sleep();
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Monkey{
    public void jump(){
        System.out.println("Monkey is jumping");
    }
    public void bite(){
        System.out.println("Monkey is biting");
    }
}

class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat() {
        System.out.println("Human is eating");
    }
    @Override
    public void sleep() {
        System.out.println("Human is sleeping");
    }
    public void speak(){
        System.out.println("Hello");
    }
}
