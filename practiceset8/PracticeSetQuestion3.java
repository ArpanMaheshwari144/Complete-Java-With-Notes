package com.practiceset8;

public class PracticeSetQuestion3 {
    public static void main(String[] args) {
        Square obj = new Square();
        obj.setSide(3);
        System.out.println(obj.area());
        System.out.println(obj.perimeter());
    }
}

class Square{
    int side;

    public void setSide(int s) {
        side = s;
    }

    public int area(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }
}
