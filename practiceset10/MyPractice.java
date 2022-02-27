package com.practiceset10;

public class MyPractice {
    public static void main(String[] args) {
        Rectangle1 obj1 = new Rectangle1(12, 12);
        double area = obj1.area();
        System.out.println("The area of the Rectangle is " + area);

        Cuboid1 obj2 = new Cuboid1(12, 13, 14);
        double surfacearea = obj2.surfaceArea();
        double volume = obj2.volume();
        System.out.println("The surface area of the Cuboid is " + surfacearea);
        System.out.println("The volume of the Cuboid is " + volume);
    }
}

class Rectangle1{
    public int length;
    public int breadth;

    Rectangle1(){
        System.out.println("This is a non-parameterized constructor of a Rectangle1 Class");
    }
    Rectangle1(int length, int breadth){
        System.out.println("This is a parameterized constructor of a Rectangle1 Class");
        this.length = length;
        this.breadth = breadth;
    }

    public double area(){
        return this.length*this.breadth;
    }
}

class Cuboid1 extends Rectangle1{
    public int height;

    Cuboid1(int length, int breadth, int height){
        super(length, breadth);
        System.out.println("This is a parameterized constructor of a Cuboid1 Class");
        this.height = height;
    }

    public double surfaceArea(){
        return ((2*this.length*this.breadth)+(2*this.length*this.height)+(2*this.height*this.breadth));
    }

    public double volume(){
        return this.length*this.breadth*this.height;
    }
}
