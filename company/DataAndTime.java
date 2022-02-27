package com.company;

public class DataAndTime {
    public static void main(String[] args) {
        // return numbers of seconds from 1 jan 1970 till to current time
         System.out.println(System.currentTimeMillis());

         System.out.println(System.currentTimeMillis()/1000); // milliseconds change in seconds

         System.out.println(System.currentTimeMillis()/1000/3600); // seconds change in hours

         System.out.println(System.currentTimeMillis()/1000/3600/24); // hours change in days

         // return numbers of years from 1 jan 1970 till to current year
         System.out.println(System.currentTimeMillis()/1000/3600/24/365); // days change in year
    }
}
