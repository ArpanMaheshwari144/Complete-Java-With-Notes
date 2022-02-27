package com.practiceset8;

public class PracticeSetQuestion2 {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone();
        phone.ring();
        phone.vibrate();
    }
}

class CellPhone{
    public void ring(){
        System.out.println("CellPhone is Ringing.....");
    }

    public void vibrate(){
        System.out.println("CellPhone is Vibrating.....");
    }
}
