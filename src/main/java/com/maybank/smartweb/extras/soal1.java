package com.maybank.smartweb.extras;

public class soal1 {

    public static void main(String[] args) {
        int n = 3;

        for (int i=0; i<n; i++) { // 1 < 3
            for (int j=0; j<i; j++) { // 0 < 1, 1 < 1
                System.out.print("  ");
            }
            System.out.println("*");
        }

        System.out.println("input:" + n);

    }

}
