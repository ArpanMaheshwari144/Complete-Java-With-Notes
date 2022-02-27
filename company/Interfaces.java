package com.company;

public class Interfaces {
    public static void main(String[] args) {
        AvonCycle obj = new AvonCycle();
        obj.blowHorn();
        obj.applyBrake(1);
        obj.speedUp(2);
        obj.blowHorn1();
        obj.blowHorn2();
        System.out.println(obj.a);
        System.out.println(obj.x);

        // System.out.println(obj.a); // We can create properties in Interfaces
        // obj.a = 50; // we cannot modify the properties in Interfaces as they are final
    }
}

interface Bicycle{
    int a = 45;  // In Interfaces properties are final and public by default
    // These methods will become public. The class that is implementing this interface
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface hornBicycle{
    int x = 5;
    // These methods will become public. The class that is implementing this interface
   void blowHorn1();
   void blowHorn2();
}

class AvonCycle implements Bicycle, hornBicycle{
    // int x = 10;
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }

    @Override
    public void applyBrake(int decrement) {
        System.out.println("Applying brake and speed will decrement by " + decrement);
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Increase the speed of the cycle by " + increment);
    }

    @Override
    public void blowHorn1() {
        System.out.println("Pee Pee Pee Pee");
    }

    @Override
    public void blowHorn2() {
        System.out.println("Poo Poo Poo Poo");
    }
}
