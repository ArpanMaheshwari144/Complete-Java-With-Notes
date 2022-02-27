package com.company;

public class ConstructorsInThread1 {
    public static void main(String[] args) {
        MyThread3 obj1 = new MyThread3(null,"");
        Thread t1 = new Thread(obj1);
        MyThread3 obj2 = new MyThread3(null,"");
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        System.out.println("The id of the 1st thread is: " + t1.getId());
        System.out.println("The name of the 1st thread is: " + t1.getName());
        System.out.println("The id of the 2nd thread is: " + t2.getId());
        System.out.println("The name of the 2nd thread is: " + t2.getName());
    }
}

class MyThread3 implements Runnable{
    String name;
    Runnable target;
    public MyThread3(Runnable target, String name){
        this.target=target;
        this.name=name;
    }
    public void run() {
        int i = 0;
        while(i<5){
            System.out.println("I am a thread");
            i++;
        }
    }
}

