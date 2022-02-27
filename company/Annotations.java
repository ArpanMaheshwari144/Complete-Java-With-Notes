package com.company;

@FunctionalInterface // it means that function mei sirf ek hi abstract method hoga
interface myFunctionalInteface{
    void myMethod();
    // void myMethod2();
}

class NewPhone extends Phone{
    @Override // Annotations
    public void showTime(){
        System.out.println("Time is 8PM");
    }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}

public class Annotations {
    @SuppressWarnings("deprication")
    public static void main(String[] args) {
        NewPhone p = new NewPhone();
        p.showTime();
        System.out.println(p.sum(10,10));
    }
}