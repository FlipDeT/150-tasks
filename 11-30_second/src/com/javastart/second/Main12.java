package com.javastart.second;

import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input 3 Numbers");
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();
        int thirdNum = input.nextInt();

        System.out.println("Arithmetic mean = "+ (firstNum+secondNum+thirdNum)/3);

    }
}
