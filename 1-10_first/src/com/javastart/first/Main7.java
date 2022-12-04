package com.javastart.first;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input number:");
        int number = input.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(number+" * "+i+" = "+ number*i);
        }
    }
}
