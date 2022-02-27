package com.company;

public class Polymorphism {
    public static void main(String[] args) {
        MyCamera1 obj1 = new MySmartPhone1();  // this is a smartphone but, use it as a camera
        obj1.takePhoto();
        obj1.recordVideo();
        obj1.record4KVideo();

        System.out.println("=================================");

        MyWifi1 obj2 = new MySmartPhone1();  // this is a smartphone but, use it as a wifi
        String[] networklist1 = obj2.getNetworks();
        for(String i : networklist1){
            System.out.println(i + " ");
        }
        obj2.connectToNetwork("Arpan12");

        System.out.println("=================================");

        MySmartPhone obj3 = new MySmartPhone();
        obj3.takePhoto();
        obj3.recordVideo();
        obj3.record4KVideo();
        obj3.callNumber(897770999);
        obj3.pickCall("Arpan");
        String[] networklist2 = obj3.getNetworks();
        for(String i : networklist2){
            System.out.println(i + " ");
        }
        obj3.connectToNetwork("Arpan12345");
    }
}


interface MyCamera1{
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

interface MyWifi1{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone1{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(String name){
        System.out.println(name + " is calling...");
    }
}

class MySmartPhone1 extends MyCellPhone1 implements MyWifi1, MyCamera1{
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
