package com.company;

public class Threads1 {
    public static void main(String[] args) {
        MyThreadRunnable1 obj1 = new MyThreadRunnable1();
        Thread t1 = new Thread(obj1);
        MyThreadRunnable2 obj2 = new MyThreadRunnable2();
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}

class MyThreadRunnable1 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while(i <= 50) {
            System.out.println("Thread1 is running");
            i++;
        }
    }
}

class MyThreadRunnable2 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while(i <= 50) {
            System.out.println("Thread2 is running");
            i++;
        }
    }
}
