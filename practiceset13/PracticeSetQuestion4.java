package com.practiceset13;

public class PracticeSetQuestion4 {
    public static void main(String[] args) {
        MyThread5 obj = new MyThread5();
        System.out.println(obj.getState());
        obj.start();
        System.out.println(obj.getState());
    }
}

class MyThread5 extends Thread {
    @Override
    public void run() {
        System.out.println("My Thread");
    }
}
