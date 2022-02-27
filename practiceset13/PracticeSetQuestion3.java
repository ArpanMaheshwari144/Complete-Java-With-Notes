package com.practiceset13;

public class PracticeSetQuestion3 {
    public static void main(String[] args) {
        MyThread3 obj1 = new MyThread3();
        MyThread4 obj2 = new MyThread4();
        obj1.setPriority(5);
        obj2.setPriority(7);
        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());
        obj1.start();
        obj2.start();
    }
}

class MyThread3 extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<3) {
            System.out.println("Good Morning");
            i++;
        }
    }
}

class MyThread4 extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<3) {
            System.out.println("Welcome");
            i++;
        }
    }
}
