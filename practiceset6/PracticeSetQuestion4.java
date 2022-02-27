package com.practiceset6;

public class PracticeSetQuestion4 {
    public static void main(String[] args) {
        int [][] a = {{1, 2, 3},
                      {4, 5, 6}};
        int [][] b = {{2, 6, 13},
                      {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                           {0, 0, 0}};

        for (int i=0;i<a.length;i++){ // row number of times
            for (int j=0;j<a[i].length;j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        // Printing the elements of a 2-D Array
        for (int i=0;i<a.length;i++){ // row number of times
            for (int j=0;j<a[i].length;j++) { // column number of time
                System.out.print(result[i][j] + " ");
            }
            System.out.println(""); // Prints a new line
        }
    }
}
