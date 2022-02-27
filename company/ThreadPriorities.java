package com.company;

public class ThreadPriorities {
    public static void main(String[] args) {
        MyThread4 obj1=new MyThread4("Arpan1");
        MyThread4 obj2=new MyThread4("Arpan2");
        MyThread4 obj3=new MyThread4("Arpan3");
        MyThread4 obj4=new MyThread4("Arpan4");
        MyThread4 obj5=new MyThread4("Arpan5");
        obj5.setPriority(Thread.MAX_PRIORITY);
        obj1.setPriority(Thread.MIN_PRIORITY);
        obj2.setPriority(Thread.MIN_PRIORITY);
        obj3.setPriority(Thread.MIN_PRIORITY);
        obj4.setPriority(Thread.MIN_PRIORITY);
        obj1.start();
        obj2.start();
        obj3.start();
        obj4.start();
        obj5.start();

    }
}

class MyThread4 extends Thread{
    public MyThread4(String name){
        super(name);
    }
    public void run() {
        System.out.println("I am a thread" + this.getName());
    }
}
