package com.company;

public class Methods {
    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x+y)+5;
        }
        return z;
    }

    static void tellJoke(){
        System.out.println("I invented a new word Plagiarism!!");
    }

    public static void main(String[] args) {
        int a = 7;
        int b = 7;
        int c;
        c = logic(a, b);
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);

        tellJoke();
    }
}
