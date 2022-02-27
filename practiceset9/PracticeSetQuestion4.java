package com.practiceset9;

public class PracticeSetQuestion4 {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        Rectangle obj2 = new Rectangle(10, 11);
        System.out.println(obj1.getLength());
        System.out.println(obj1.getBreadth());
        System.out.println(obj2.getLength());
        System.out.println(obj2.getBreadth());
    }
}

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
