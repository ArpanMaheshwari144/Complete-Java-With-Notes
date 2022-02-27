package com.company1;

public class Sphere extends Shape {
    Sphere(int dim1, int dim2) {
        super(dim1, dim2);
    }
    public double surfaceArea(){
        return 4*Math.PI*dim1*dim1;
    }
    public double volume(){
        return 4.0/3.0*Math.PI*dim1*dim1*dim1;
    }
}
