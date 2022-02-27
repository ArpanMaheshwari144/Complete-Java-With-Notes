package com.practiceset8;

public class PracticeSetQuestion5 {
    public static void main(String[] args) {
        TommyVercetti obj = new TommyVercetti();
        obj.hit();
        obj.run();
        obj.fire();
    }
}

class TommyVercetti{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}