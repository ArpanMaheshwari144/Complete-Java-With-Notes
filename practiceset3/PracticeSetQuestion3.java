package com.practiceset3;

public class PracticeSetQuestion3 {
    public static void main(String[] args) {
        String letter = "Dear <|name|>, Thanks a lot";
        System.out.println(letter.replace("<|name|>", "Arpan")); // this will not affect original string at all
        System.out.println(letter);

    }
}
