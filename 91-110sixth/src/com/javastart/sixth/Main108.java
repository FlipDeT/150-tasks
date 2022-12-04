package com.javastart.sixth;

import java.util.Scanner;

public class Main108 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int number = input.nextInt();
        int sum = 0;

        while (number / 10 > 0) {
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            number = sum;
            sum = 0;
        }

        System.out.println(number);
    }
}
