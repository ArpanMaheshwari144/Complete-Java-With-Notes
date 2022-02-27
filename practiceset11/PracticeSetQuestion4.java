package com.practiceset11;

public class PracticeSetQuestion4 {
    public static void main(String[] args) {
        TelePhone obj = new SmartTelephone();
        obj.ring();
        obj.lift();
        obj.disConnect();
    }
}

abstract class TelePhone{
    abstract public void ring();
    abstract public void lift();
    abstract public void disConnect();
}

class SmartTelephone extends TelePhone{
    @Override
    public void ring() {
        System.out.println("Phone is ringing");
    }
    @Override
    public void lift() {
        System.out.println("Phone is lifting");
    }
    @Override
    public void disConnect() {
        System.out.println("Phone is dis-connected");
    }
}
