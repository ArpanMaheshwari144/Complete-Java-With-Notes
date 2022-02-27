package com.company;

public class Constructors_in_inheritance {
    public static void main(String[] args) {
        Base1 b = new Base1();

        System.out.println("===================================");

        Derived1 d1 = new Derived1();

        System.out.println("===================================");

        Derived1 d2 = new Derived1("Arpan","Adarsh");

        System.out.println("===================================");

        Derived2 d3 = new Derived2();

        System.out.println("===================================");

        Derived2 d4 = new Derived2("Arpan","Adarsh", "Verma");
    }
}

class Base1{

    public Base1() {
        System.out.println("Base1 Constructor is calling");
    }

    public Base1(String name1) {
        System.out.println("Base1 Constructor is calling with name " + name1);
    }

}

class Derived1 extends Base1{

    public Derived1() {
        super("Arpan"); // it will call parent class constructor which have 1 argument as a string
        System.out.println("Derived1 Constructor is calling");
    }

    public Derived1(String name1, String name2){
        super(name1);
        System.out.println("Derived1 Constructor is calling with " + name2);
    }
}

class Derived2 extends Derived1{

    public Derived2(){
        System.out.println("Derived2 Constructor is calling");
    }

    public Derived2(String name1, String name2, String name3){
        super(name1, name2);
        System.out.println("Derived2 Constructor is calling with " + name3);
    }
}
