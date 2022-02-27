package com.practiceset8;

public class PracticeSetQuestion6 {
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.setRadius(3);
        System.out.println(obj.area());
        System.out.println(obj.circumference());
    }
}

class Circle{
    int radius;

    public void setRadius(int r) {
        radius = r;
    }

    public double area(){
        return 3.14*radius*radius;
    }

    public double circumference(){
        return 2*3.14*radius;
    }
}
