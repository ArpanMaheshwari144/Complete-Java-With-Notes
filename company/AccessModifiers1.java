package com.company;

public class AccessModifiers1 {
    public static void main(String[] args) {
        MyClass3 obj1 = new MyClass3();
        // obj1.myMethod();
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        System.out.println(obj1.c);

        System.out.println("===============================");

        MyClass4 obj2 = new MyClass4();
        // obj2.myMethod();
        // obj2.display();
        System.out.println(obj2.a);
        System.out.println(obj2.b);
        System.out.println(obj2.c);
    }
}

class MyClass3{
    /*The access level of a public modifier is everywhere. It can be accessed from within the class,
    outside the class, within the package and outside the package.*/
    public int a = 1;

    /*The access level of a protected modifier is within the package and outside the package through child class.
     If you do not make the child class, it cannot be accessed from outside the package.*/
    protected int b = 2;

    /*The access level of a default modifier is only within the package. It cannot be accessed
    from outside the package. If you do not specify any access level, it will be the default.*/
    int c = 3;  // c cannot be use to outside this package

    /*The access level of a private modifier is only within the class.
    It cannot be accessed from outside the class.*/
    private int d = 4;  // d cannot be use to outside this class

    public void myMethod(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

class MyClass4 extends MyClass3{
    public void display(){
        System.out.println("This is MyClass4");
    }
}
