package com.javastart.sixth;

import java.util.Scanner;

public class Main110 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input number");
        int number = input.nextInt();

        while (number >= 4) {
            if (number %2 == 0) {
                number /= 4;
            } else {
                break;
            }
        }
        if (number == 1) {
            System.out.println(true);
        } else System.out.println(false);

    }
}
