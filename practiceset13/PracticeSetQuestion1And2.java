package com.practiceset13;

public class PracticeSetQuestion1And2 {
    public static void main(String[] args) {
        MyThread1 obj1 = new MyThread1();
        MyThread2 obj2 = new MyThread2();
        obj1.start();
        obj2.start();
    }
}

class MyThread1 extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<3) {
            System.out.println("Good Morning");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<3) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Welcome");
            i++;
        }
    }
}