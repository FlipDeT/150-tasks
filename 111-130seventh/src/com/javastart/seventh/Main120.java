package com.javastart.seventh;

import java.util.Scanner;

public class Main120 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input searching number");
        int number = input.nextInt();
        boolean check = false;
        int [][] matrix = new int[3][3];
        System.out.println("input matrix");
        System.out.println("   1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i+1)+"| ");
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = input.nextInt();
                if (matrix[i][j] == number) {
                    check = true;
                }
            }
        }

        System.out.println(check);

    }
}
