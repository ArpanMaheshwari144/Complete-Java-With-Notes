package com.company;

public class Finally {
    public static int func(){
        try{
            int a = 50;
            int b = 0;
            return a / b;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("This is the end of this function");
        }
        return -1;
    }
    public static void main(String[] args) {
        int result = func();
        System.out.println(result);
    }
}
