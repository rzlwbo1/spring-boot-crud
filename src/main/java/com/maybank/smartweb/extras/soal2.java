package com.maybank.smartweb.extras;

public class soal2 {

    public static void main(String[] args) {
        int n = 9;

        for (int i=0; i<n; i++) { // 0<3
            for (int j=n; j>i; j--) { //0>0
                System.out.print("  ");
            }
            System.out.println("*");
        }


    }

}
