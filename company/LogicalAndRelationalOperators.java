package com.company;

public class LogicalAndRelationalOperators {
    public static void main(String[] args) {

        System.out.println("LOGICAL AND OPERATOR");
        System.out.println("True && True = " + (true && true));
        System.out.println("True && False = " + (true && false));
        System.out.println("False && True = " + (false && true));
        System.out.println("False && False = " + (false && false));

        System.out.println();

        System.out.println("LOGICAL OR OPERATOR");
        System.out.println("True || True = " + (true || true));
        System.out.println("True || False = " + (true || false));
        System.out.println("False || True = " + (false || true));
        System.out.println("False || False = " + (false || false));

        System.out.println();

        System.out.println("LOGICAL NOT OPERATOR");
        System.out.println("Not(true) is = " + (!true));
        System.out.println("Not(false) is = " + (!false));
    }
}
