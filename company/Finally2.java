package com.company;

public class Finally2 {
    public static void main(String[] args) {
        int a = 50;
        int b = 0;
        try{
            System.out.println(a/b);
        }
        finally{
            System.out.println("finally block executed");
        }
    }
}
