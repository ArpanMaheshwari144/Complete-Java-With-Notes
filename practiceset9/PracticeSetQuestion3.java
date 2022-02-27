package com.practiceset9;

public class PracticeSetQuestion3 {
    public static void main(String[] args) {
        MyCylinder1 obj = new MyCylinder1(10, 20);
        System.out.println(obj.getRadius());
        System.out.println(obj.getHeight());
    }
}

class MyCylinder1{
    private int radius;
    private int height;

    public MyCylinder1(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }
}
