package com.practiceset9;

public class PracticeSetQuestion5 {
    public static void main(String[] args) {
        Sphere obj = new Sphere();
        obj.setRadius(5);
        System.out.println("The surface area of a sphere is: " + obj.surfaceAreaOfSphere());
        System.out.println("The volume of the sphere is: " + obj.volumeOfSphere());
    }
}

class Sphere{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double surfaceAreaOfSphere(){
        return (4*3.142*radius*radius);
    }

    public double volumeOfSphere(){
        return ((4.0/3.0)*3.142*radius*radius*radius);
    }
}