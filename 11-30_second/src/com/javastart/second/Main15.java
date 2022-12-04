package com.javastart.second;

import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input first number: ");
        int firstNum = input.nextInt();
        System.out.println("input second number: ");
        int secondNum = input.nextInt();

        int zeroNumber = secondNum;

        secondNum = firstNum;
        firstNum = zeroNumber;

        System.out.println("And now first number is: "+firstNum+"; second number is: "+secondNum);
    }
}
