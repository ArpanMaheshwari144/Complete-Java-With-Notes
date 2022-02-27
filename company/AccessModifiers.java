package com.company;

public class AccessModifiers {
    public static void main(String[] args) {
        MyEmployee obj = new MyEmployee();
        obj.setId(1);
        obj.setName("Arpan");
        System.out.println(obj.getId());
        System.out.println(obj.getName());
    }
}

class MyEmployee{
    private int id;
    private String name;

    // Setters and Getters
    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}
