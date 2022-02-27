package com.company;

public class TryCatch {
    public static void main(String[] args) {
        // Without try-catch
//        int a = 6000;
//        int b = 0;
//        int c = a / b;
//        System.out.println("The result is: " + c);
//        System.out.println("End of the program");


        // With try-catch
        int a = 6000;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("The result is: " + c);
        }
        catch (Exception e){
            System.out.println("We failed to divide. Reason: " + e);
        }
        System.out.println("End of the program");
    }
}
