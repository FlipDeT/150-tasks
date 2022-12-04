package com.javastart.fourth;

import java.util.Scanner;

public class Main64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input first number");
        int firstNumber = input.nextInt();
        System.out.println("input second number");
        int secondNumber = input.nextInt();
        boolean check = false;

        if (firstNumber < secondNumber) {
            firstNumber = firstNumber + secondNumber;
            secondNumber = firstNumber - secondNumber;
            firstNumber = firstNumber - secondNumber;
        }
        int secondMemory = secondNumber;

        while (firstNumber > 0) {
            while (secondNumber > 0) {
                if (firstNumber % 10 == secondNumber % 10) {
                    check = true;
                    break;
                }
                secondNumber = secondNumber / 10;
            }
            if (check){
                break;
            }
            secondNumber = secondMemory;
            firstNumber = firstNumber / 10;
        }
        System.out.println(check);
    }
}
