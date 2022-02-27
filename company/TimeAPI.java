package com.company;

// LocalDate -> Date and Time are immutable(unchangeable)

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeAPI {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
    }
}
