package com.company;

public class ThreadMethods {
    public static void main(String[] args) {
        MyThread5 obj1=new MyThread5();
        MyThread6 obj2=new MyThread6();
        obj1.start();
//        try {
//            // join() method exception throw karta hai
//            obj1.join(); // ye method MyThread5 ko pura execute karega than MyThread6 ko execute karega
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
        obj2.start();
    }
}

class MyThread5 extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<5) {
            System.out.println("This is 1st thread");
            try {
                Thread.sleep(1000); // Thread.sleep() method exception throw karta hai
            } catch (Exception e) {
                System.out.println(e);
            }
            i++;
        }
    }
}

class MyThread6 extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<5) {
            System.out.println("This is 2nd thread");
            i++;
        }
    }
}
