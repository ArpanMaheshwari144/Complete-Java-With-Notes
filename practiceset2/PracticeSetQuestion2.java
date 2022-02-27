package com.practiceset2;

public class PracticeSetQuestion2 {
    public static void main(String[] args) {
        /* Ques2->Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show                 the correct grade.*/

        // Encrypt
        char grade = 'B';
        grade = (char)(grade + 8); // character + integer = integer
        System.out.println("The grade after encrypt " + grade);

        // Decrypt
        grade = (char)(grade - 8);
        System.out.println("The grade after decrypt " + grade);
    }
}
