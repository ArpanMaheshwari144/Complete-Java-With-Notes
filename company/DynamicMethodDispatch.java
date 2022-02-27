package com.company;

class Phone{
    public void showTime(){
        System.out.println("Showing Time....");
    }
    public void on(){
        System.out.println("Turning on Phone....");
    }
}

class SmartPhone extends Phone{
    public void playMusic(){
        System.out.println("Playing Music....");
    }
    @Override
    public void on() {
        System.out.println("Turning on SmartPhone....");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone obj1 = new Phone();
        obj1.showTime();
        obj1.on();

        System.out.println("=================================");

        SmartPhone obj2 = new SmartPhone();
        obj2.playMusic();
        obj2.on();

        System.out.println("=================================");

        // Dynamic Method Dispatching
        Phone obj3 = new SmartPhone();
        obj3.showTime();
        obj3.on();
    }
}
