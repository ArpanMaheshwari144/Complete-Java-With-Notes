package com.practiceset7;

public class PracticeSetQuestion6 {
    public static void main(String[] args) {

        System.out.println(averageOfNumbers(2, 3, 9));

    }

    static float averageOfNumbers(float... arr){
        float n = arr.length;
        float result = 0;
        for(float a: arr){
            result += a;
        }
        return result/n;
    }
}
