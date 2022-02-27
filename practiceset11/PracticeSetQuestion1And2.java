package com.practiceset11;

public class PracticeSetQuestion1And2 {
    public static void main(String[] args) {
        FountainPen obj = new FountainPen();
        obj.write();
        obj.refil();
        obj.changeNib();
    }
}

abstract class Pen{
    abstract public void write();
    abstract public void refil();
}

class FountainPen extends Pen{
    @Override
    public void write() {
        System.out.println("Writing");
    }
    @Override
    public void refil() {
        System.out.println("Refilling");
    }

    public void changeNib(){
        System.out.println("Changing nib");
    }
}
