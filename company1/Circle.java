package com.company1;

public class Circle extends Shape {
    Circle(int dim1) {
        super(dim1, -1);
    }
    public double area(){
        return Math.PI*dim1*dim1;
    }
}
