package com.company;

public class OperatorsPrecedence {
    public static void main(String[] args) {

        // Highest precedence goes to * and / . They are then evaluated on the basis of left to right associativity
        //int a = 60 * 5 - 34 / 2; // = 300-34/2 = 300-17 = 283
        //int b = 60 / 5 - 34 * 2; // = 60/5-68 = 12-68 = -56
        //System.out.println(a);
        //System.out.println(b);

        //int x;
        //int y = 45;
        //x = y; // They are evaluated on the basis of right to left associativity
        //System.out.println(x);
        //System.out.println(y);

        //int x = 6;
        //int y = 1;
        //int z = x * y / 2;
        //System.out.println(z);

        int a = 5;
        int b = 1;
        int c = 4;
        int d = (b * b - 4 * a * c) / (2 * a);
        System.out.println(d);



    }
}
