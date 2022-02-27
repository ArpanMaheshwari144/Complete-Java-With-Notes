package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterClass {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); // This is the date
        System.out.println(dt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // This is the format
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy - E H:m:s a");
        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate = dt.format(dtf); // Creating date string using date and format
        String myDate1 = dt.format(dtf1);
        String myDate2 = dt.format(dtf2);
        System.out.println(myDate);
        System.out.println(myDate1);
        System.out.println(myDate2);
    }
}
