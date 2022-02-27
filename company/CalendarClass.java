package com.company;

// Calender -> Date and Time are mutable(changeable)

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarClass {
    public static void main(String[] args) {
         // Calendar c = Calendar.getInstance();
         // System.out.println(c.getCalendarType());
         // System.out.println(c.getTimeZone());
         // System.out.println(c.getTimeZone().getID());

         Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
         System.out.println(c.getCalendarType());
         System.out.println(c.getTimeZone());
         System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());
    }
}
