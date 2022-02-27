package com.company;

public class ConstructorsInThread {
    public static void main(String[] args) {
        MyThread obj1 = new MyThread("Arpan");
        MyThread obj2 = new MyThread("Adarsh");
        obj1.start();
        obj2.start();
        System.out.println("The id of the 1st thread is: " + obj1.getId());
        System.out.println("The name of the 1st thread is: " + obj1.getName());
        System.out.println("The id of the 2nd thread is: " + obj2.getId());
        System.out.println("The name of the 2nd thread is: " + obj2.getName());
    }
}

class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run() {
        int i = 0;
        while(i<5){
            System.out.println("I am a thread");
            i++;
        }
    }
}
