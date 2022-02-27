package com.practiceset10;

public class PracticeSetQuestion1 {
    public static void main(String[] args) {
        Circle obj1 = new Circle(12);
        double area = obj1.area();
        System.out.println("The area of a Circle is " + area);
        Cylinder obj2 = new Cylinder(12,12);
        double volume = obj2.volume();
        System.out.println("The volume of Cylinder is " + volume);
    }
}

class Circle{
    public int radius;

    Circle(){
        System.out.println("This is a non-parameterized constructor of a Circle Class");
    }
    Circle(int radius){
        System.out.println("This is a parameterized constructor of a Circle Class");
        this.radius = radius;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder extends Circle{
    public int height;

    Cylinder(int radius, int height) {
        super(radius);
        System.out.println("This is a parameterized constructor of a Cylinder Class");
        this.height = height;
    }

    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
