package com.practiceset8;

public class PracticeSetQuestion1 {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.salary = 123333;
        System.out.println(obj.getSalary());
        obj.setName("Arpan");
        System.out.println(obj.getName());
    }
}

class Employee{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}
