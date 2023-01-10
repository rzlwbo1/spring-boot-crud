package com.maybank.smartweb.extras;

public class soal6 {

    public static void main(String[] args) {

        int n = 9;

        for (int i=0; i<n; i++) {
            for (int j=0; j < i; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }

}
