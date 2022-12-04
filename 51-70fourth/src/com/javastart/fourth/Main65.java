package com.javastart.fourth;

import java.util.Scanner;

public class Main65 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input number");
        int number = input.nextInt();

        if (number < 0) {
            number = number - 2*number;
        }
        System.out.println(number);
    }
}
