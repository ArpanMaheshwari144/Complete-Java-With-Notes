package com.company;

public class ThisAndSuperKeyword {
    public static void main(String[] args) {
        MyClass1 obj1 = new MyClass1(5);
        MyClass2 obj2 = new MyClass2(3);
        System.out.println(obj1.getA());
        System.out.println(obj2.getA());
    }
}

class MyClass1{
    int a;

    public int getA(){
        return a;
    }

    MyClass1(int a){
        this.a = a;
        System.out.println("I am a constructor of MyClass1");
    }
}

class MyClass2 extends MyClass1{

    MyClass2(int a) {
        super(a);
        System.out.println("I am a constructor of MyClass2");
    }
}
