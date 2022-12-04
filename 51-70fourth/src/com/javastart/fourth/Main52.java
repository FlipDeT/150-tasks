package com.javastart.fourth;

import java.util.Scanner;

public class Main52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first num: ");
        int firstNum = input.nextInt();
        System.out.print("Input second num: ");
        int secondNum = input.nextInt();
        System.out.print("Input third num: ");
        int thirdNum = input.nextInt();

        if (firstNum + secondNum == thirdNum) {
            System.out.println("true");
        } else System.out.println("false");
    }
}
