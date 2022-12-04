package com.javastart.fourth;

import java.util.Scanner;

public class Main51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input number (String): ");
        String numString = input.next();
        int k = 0;
        int numInt = 0;

        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (numString.length(); k < numString.length(); k++){
            for (int i = 0; i <= 9; i++) {
                if (numString.charAt(k) == numbers[i]) {
                    numInt = numInt * 10 + i;
                    break;
                }
            }
        }
        System.out.println(numInt);
    }
}
