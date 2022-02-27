package com.company1;

public class Cylinder extends Shape {
    Cylinder(int dim1, int dim2) {
        super(dim1, dim2);
    }
    public double surfaceArea(){
        return 2*Math.PI*dim1*(dim2+dim1);
    }
    public double volume(){
        return Math.PI*dim1*dim1*dim2;
    }
}
