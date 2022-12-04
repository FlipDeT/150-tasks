package com.javastart.third;

import java.util.Scanner;

public class Main32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input first number");
        int firstNum = input.nextInt();

        System.out.println("input second number");
        int secondNum = input.nextInt();

        if (firstNum == secondNum) {
            System.out.println(firstNum+" = "+ secondNum);
        } else if (firstNum > secondNum) {
            System.out.println(firstNum+" > "+ secondNum);
        } else System.out.println(firstNum+" < "+ secondNum);
    }
}
