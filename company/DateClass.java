package com.company;

import java.util.Date;

public class DateClass {
    public static void main(String[] args) {
        // long milliSeconds = System.currentTimeMillis();
        // System.out.println(milliSeconds);

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime()); // return time in milliseconds from 1 jan 1970 till to current time
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear()); // return year from 1900 till to current year
    }
}
