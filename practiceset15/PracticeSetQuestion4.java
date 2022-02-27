package com.practiceset15;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PracticeSetQuestion4 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("H:m:s");
        String myDate = dt.format(dtf);
        System.out.println(myDate);
    }
}
