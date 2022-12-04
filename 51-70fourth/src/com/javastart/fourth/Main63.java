package com.javastart.fourth;

import java.util.Scanner;

public class Main63 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input first number");
        int firstNumber = input.nextInt();
        System.out.println("input second number");
        int secondNumber = input.nextInt();

        if (firstNumber < secondNumber) {
            firstNumber = firstNumber + secondNumber;
            secondNumber = firstNumber - secondNumber;
            firstNumber = firstNumber - secondNumber;
        }

        if (firstNumber % 6 != secondNumber% 6 && firstNumber != secondNumber) {
            System.out.println(firstNumber);
        } else if (firstNumber == secondNumber) {
            System.out.println(0);
        } else System.out.println(secondNumber);

    }
}
