package com.practiceset4;

import java.util.Scanner;

public class PracticeSetQuestion6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a website name: ");
        String website = in.nextLine();
        if(website.endsWith(".org")){
            System.out.println("This is an Organizational website!!");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is a Commercial website!!");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an Indian website!!");
        }
    }
}
