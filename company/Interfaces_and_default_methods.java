package com.company;

public class Interfaces_and_default_methods {
    public static void main(String[] args) {
        MySmartPhone obj = new MySmartPhone();
        obj.takePhoto();
        obj.recordVideo();
        obj.record4KVideo();
        obj.callNumber(897770999);
        obj.pickCall("Arpan");
        String[] networklist = obj.getNetworks();
        for(String i : networklist){
            System.out.println(i + " ");
        }
        obj.connectToNetwork("Arpan12345");
    }
}

interface MyCamera{
    void takePhoto();
    void recordVideo();
    private void recordInSlowMotion(){
        System.out.println("Recording in slow motion...");
    }
    default void record4KVideo(){
        recordInSlowMotion();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(String name){
        System.out.println(name + " is calling...");
    }
}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    @Override
    public void takePhoto() {
        System.out.println("Taking photo...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video...");
    }

    // this is a default method, so no need to override
//    @Override
//    public void record4KVideo() {
//        System.out.println("Take photo and record video in 4k...");
//    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting list of networks -");
        String[] networkList = {"Arpan56", "Adarsh123", "Verma234"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to the " + network);
    }
}
