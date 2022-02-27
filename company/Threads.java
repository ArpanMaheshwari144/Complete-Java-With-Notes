package com.company;

public class Threads {
    public static void main(String[] args) {
        MyThread1 obj1 = new MyThread1();
        MyThread2 obj2 = new MyThread2();
        obj1.start();
        obj2.start();
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while(i <= 50){
            System.out.println("This is Thread 1");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while(i <= 50){
            System.out.println("This is Thread 2");
            i++;
        }
    }
}
