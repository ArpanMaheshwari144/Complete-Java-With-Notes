package com.practiceset12.mypackage1.mypackage2;

import com.practiceset12.mypackage1.PracticeSetQuestion4;

public class MyClass {
    public static void main(String[] args) {
        TempClass obj = new TempClass();
        obj.display();
    }
}

class TempClass extends PracticeSetQuestion4 {
    void display(){
        System.out.println(a);
         // System.out.println(b);
    }
}
