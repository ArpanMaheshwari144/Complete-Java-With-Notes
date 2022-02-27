package com.company;

public class Finally1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 9;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("For value b = " + b);
            }
            b--;
        }
    }
}
