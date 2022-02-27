package com.company;

public class Inheritance {
    public static void main(String[] args) {

        // Creating an object of Base Class
        Base b = new Base();
        b.setX(3);
        System.out.println(b.getX());
        b.display1();

        System.out.println("===========================================");

        // Creating an object of Derived Class
        Derived d = new Derived();
        d.setX(3);
        System.out.println(d.getX());
        d.setY(4);
        System.out.println(d.getY());
        d.display1();
        d.display2();
    }
}

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in Base Class and setting x now");
        this.x = x;
    }

    public void display1(){
        System.out.println("I am a Base Class method");
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I am in Derived Class and setting y now");
        this.y = y;
    }

    public void display2(){
        System.out.println("I am a Derived Class method");
    }
}
