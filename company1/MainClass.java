package com.company1;

public class MainClass {
    public static void main(String[] args) {
        Shape obj1 = new Shape(10, 10);
        Rectangle obj2 = new Rectangle(10,10);
        Square obj3 = new Square(10);
        Circle obj4 = new Circle(10);
        Cylinder obj5 = new Cylinder(10, 10);
        Sphere obj6 = new Sphere(10, 10);
        System.out.println("The area of the rectangle is: " + obj2.area());
        System.out.println("The area of the square is: " + obj3.area());
        System.out.println("The area of the circle is: " + obj4.area());
        System.out.println("The surface area of the cylinder is: " + obj5.surfaceArea());
        System.out.println("The volume of the cylinder is: " + obj5.volume());
        System.out.println("The surface area of the sphere is: " + obj6.surfaceArea());
        System.out.println("The volume of the sphere is: " + obj6.volume());
    }
}
