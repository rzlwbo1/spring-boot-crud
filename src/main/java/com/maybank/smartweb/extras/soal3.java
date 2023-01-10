package com.maybank.smartweb.extras;

public class soal3 {
    public static void main(String[] args) {
        int n = 9;

        for (int i = 1; i < n + 1; i++) { // 1 < 9 + 1
            for (int j = 1; j < n + 1; j++) { // 1 < 9 =
                if (i == j || i + j == n + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
