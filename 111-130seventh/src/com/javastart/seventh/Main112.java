package com.javastart.seventh;

import java.util.Scanner;

public class Main112 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number");
        int number = input.nextInt();
        int memory = 1;
        int factorial = 1;
        while (number + 1 != memory) {
            factorial *= memory;
            memory++;
        }
        memory = 0;
        System.out.println(number+"! = "+factorial);
        while (factorial % 10 == 0) {
            memory++;
            factorial /= 10;
        }
        System.out.println("count of 0 in end = "+memory);
    }
}
