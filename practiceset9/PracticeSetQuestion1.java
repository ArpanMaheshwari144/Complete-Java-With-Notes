package com.practiceset9;

public class PracticeSetQuestion1 {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder();
        obj.setRadius(23);
        obj.setHeight(44);
        System.out.println("The radius of the cylinder is: " + obj.getRadius());
        System.out.println("The height of the cylinder is: " + obj.getHeight());
    }
}

class Cylinder{
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
}
