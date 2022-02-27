package com.company;

public class MyDeadlock {
    public static void main(String[] args) {
            Demo1 demoObj = new Demo1();
            demoObj.firstMethod();
            demoObj.secondMethod();
    }
}

class Demo1  {
    public void firstMethod() {
        System.out.println("Locking String.class");
        synchronized (String.class) {
            System.out.println("Locking String.class");
        }
        System.out.println("Release String.class");

        System.out.println("Locking Integer.class");
        synchronized (Integer.class) {
            System.out.println("Locking Integer.class");
        }
        System.out.println("Release Integer.class");
    }

    public void secondMethod() {
        System.out.println("Locking Integer.class");
        synchronized (Integer.class) {
            System.out.println("Locking Integer.class");
        }
        System.out.println("Release Integer.class");

        System.out.println("Locking String.class");
        synchronized (String.class) {
            System.out.println("Locking String.class");
        }
        System.out.println("Release String.class");
    }
}
