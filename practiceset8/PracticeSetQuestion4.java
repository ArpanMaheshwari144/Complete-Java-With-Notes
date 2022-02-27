package com.practiceset8;

public class PracticeSetQuestion4 {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.setLength(2);
        obj.setBreadth(3);
        System.out.println(obj.area());
        System.out.println(obj.perimeter());
    }
}

class Rectangle{
    int length;
    int breadth;

    public void setLength(int l) {
        length = l;
    }

    public void setBreadth(int b) {
        breadth = b;
    }

    public int area(){
        return length*breadth;
    }

    public int perimeter(){
        return 2*(length+breadth);
    }
}
