package com.company;

public class Constructors {
    public static void main(String[] args) {
        MyMainEmployee obj1 = new MyMainEmployee();
        MyMainEmployee obj2 = new MyMainEmployee("Adarsh");
        MyMainEmployee obj3 = new MyMainEmployee(3, "Verma");
        System.out.println(obj1.getId() + " " + obj1.getName());
        System.out.println(obj2.getId() + " " + obj2.getName());
        System.out.println(obj3.getId() + " " + obj3.getName());
    }
}

class MyMainEmployee{
    int id;
    String name;

    public MyMainEmployee(){
        id = 1;
        name = "Arpan";
    }
    public MyMainEmployee(String myName){
        id = 2;
        name = myName;
    }
    public MyMainEmployee(int myId, String myName){
        id = myId;
        name = myName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
