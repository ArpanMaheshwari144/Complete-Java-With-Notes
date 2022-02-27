package com.company;

public class CustomClass {
    public static void main(String[] args) {
        Employee obj1 = new Employee();  // Instantiating a new Employee Object
        Employee obj2 = new Employee();  // Instantiating a new Employee Object

        // Setting Attributes for Object1
        obj1.id = 1;
        obj1.name = "Arpan";
        obj1.salary = 873833;

        // Setting Attributes for Object2
        obj2.id = 2;
        obj2.name = "Adarsh";
        obj2.salary = 965367;

        // Printing the Attributes
        // System.out.println(obj.id);
        // System.out.println(obj.name);

        // Printing the Attributes by calling the method
        obj1.printDetails();
        int salary1 = obj1.getSalary();
        System.out.println("The salary of " + obj1.name + " is: " + salary1);

        obj2.printDetails();
        int salary2 = obj2.getSalary();
        System.out.println("The salary of " + obj2.name + " is: " + salary2);
    }
}

// ek java file ke andar sirf ek hi class public hogi
class Employee{
    int id;
    String name;
    int salary;

    public void printDetails(){
        System.out.println("Id is: " + id);
        System.out.println("Name is: " + name);
    }

    public int getSalary() {
        return salary;
    }
}
