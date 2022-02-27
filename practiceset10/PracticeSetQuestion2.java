package com.practiceset10;

public class PracticeSetQuestion2 {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        obj1.setLength(12);
        obj1.setBreadth(12);
        double area = obj1.area();
        System.out.println("The area of the Rectangle is " + area);
        Cuboid obj2 = new Cuboid();
        obj2.setLength(12);
        obj2.setBreadth(12);
        obj2.setHeight(15);
        double surfacearea = obj2.surfaceArea();
        double volume = obj2.volume();
        System.out.println("The surface area of the Cuboid is " + surfacearea);
        System.out.println("The volume of the Cuboid is " + volume);
    }
}

class Rectangle{
    public int length;
    public int breadth;

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public double area(){
        return this.length*this.breadth;
    }
}

class Cuboid extends Rectangle{
    public int length;
    public int breadth;
    public int height;

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea(){
        return ((2*this.length*this.breadth)+(2*this.length*this.height)+(2*this.height*this.breadth));
    }

    public double volume(){
        return this.length*this.breadth*this.height;
    }
}
