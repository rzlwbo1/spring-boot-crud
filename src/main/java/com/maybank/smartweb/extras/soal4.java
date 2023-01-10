package com.maybank.smartweb.extras;

public class soal4 {
    public static void main(String[] args) {
        int n = 9;

        for (int baris=0; baris < n; baris++) {

            for (int kolom=0; kolom < n; kolom++) {

                if (baris == 0) {

                    if (kolom == 0) {
                        System.out.print("*");
                    } else if (kolom == 4 || kolom == 8) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                } else if (baris == 1) {
                    if (kolom == 1 || kolom == 4 || kolom == 7) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else if (baris == 2) {
                    if (kolom == 2 || kolom == 4 || kolom == 6) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else if (baris == 3) {
                    if (kolom == 3 || kolom == 4 || kolom == 5) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else if (baris == 4) {
                    System.out.print("*");
                }

            }

            System.out.println(" ");
        }

    }
}
