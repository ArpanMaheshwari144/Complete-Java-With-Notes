package com.practiceset11;

public class PracticeSetQuestion6And7 {
    public static void main(String[] args) {
        TV obj = new TV();
        obj.changeChannels();
        obj.changeChannelsBySpeaking();
    }
}

interface TVRemote{
    void changeChannels();
}

interface SmartTVRemote extends TVRemote{
    void changeChannelsBySpeaking();
}

class TV implements SmartTVRemote{
    @Override
    public void changeChannels() {
        System.out.println("Changing channels by button");
    }
    @Override
    public void changeChannelsBySpeaking() {
        System.out.println("Changing channels by speaking");
    }
}