package com.practiceset13;

public class PracticeSetQuestion5 {
    public static void main(String[] args) {
        MyThread6 obj = new MyThread6();
        System.out.println(Thread.currentThread().getState());
        obj.start();
    }
}

class MyThread6 extends Thread {
    @Override
    public void run() {
        System.out.println("My Thread");
    }
}
