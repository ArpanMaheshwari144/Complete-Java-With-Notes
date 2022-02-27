package com.company;

public class BreakAndContinue {
    public static void main(String[] args) {
        // Break with for loop
//        for (int i=0;i<5;i++){
//            System.out.println(i + " Arpan");
//            if(i==2){
//                break;
//            }
//        }
//        System.out.println("For loop ends here!!");



        // Break with while loop
//        int i = 0;
//        while(i<5){
//            System.out.println(i + " Arpan");
//            if(i==2){
//                break;
//            }
//            i++;
//        }
//        System.out.println("While loop ends here!!");



        // Break with do-while loop
//        int i=0;
//        do{
//            System.out.println(i + " Arpan");
//            if(i==2){
//                break;
//            }
//            i++;
//        }while(i<5);
//        System.out.println("Do-While loop ends here!!");



        // Continue using for loop
//        for(int i=0;i<5;i++){
//            if(i==2){
//                continue;
//            }
//            System.out.println(i + " Arpan");
//        }
//        System.out.println("For loop ends here!!");



        // Continue using while loop
//        int i = 0;
//        while(i<5){
//            i++;
//            if(i==2){
//                continue;
//            }
//            System.out.println(i + " Arpan");
//        }
//        System.out.println("While loop ends here!!");



        // Continue using do-while loop
        int i=0;
        do{
            i++;
            if(i==2){
                continue;
            }
            System.out.println(i + " Arpan");
        }while(i<5);
        System.out.println("Do-While loop ends here!!");
    }
}
