package com.company1;

public class Shape {
    int dim1, dim2;
    Shape(int dim1, int dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    // getters and setters for dim1
    public int getDim1() {
        return dim1;
    }
    public void setDim1(int dim1) {
        this.dim1 = dim1;
    }

    // getters and setters for dim2
    public int getDim2() {
        return dim2;
    }
    public void setDim2(int dim2) {
        this.dim2 = dim2;
    }
}
