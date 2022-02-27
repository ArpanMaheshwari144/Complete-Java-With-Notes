package com.practiceset3;

public class PracticeSetQuestion4 {
    public static void main(String[] args) {
        String myString = "This string contains   double and triple spaces ";

        System.out.println(myString.contains("  "));
        System.out.println(myString.contains("   "));

        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

    }
}
