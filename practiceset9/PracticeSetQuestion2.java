package com.practiceset9;

public class PracticeSetQuestion2 {
    public static void main(String[] args) {
        MyCylinder obj = new MyCylinder();
        obj.setRadius(9);
        obj.setHeight(12);
        System.out.println("The total surface are of the cylinder is: " + obj.totalSurfaceAreaOfCylinder());
        System.out.println("The volume of the cylinder is: " + obj.volumeOfCylinder());
    }
}

class MyCylinder {
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double volumeOfCylinder(){
        return (Math.PI*radius*radius*height);
    }

    public double totalSurfaceAreaOfCylinder(){
        return ((2*Math.PI*radius*height) + (2*Math.PI*radius*radius));
    }
}
