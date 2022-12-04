package com.javastart.first;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNum;
        int secondNum;
        int sum;

        System.out.println("Input first Number: ");
        firstNum = input.nextInt();
        System.out.println("Input second Number: ");
        secondNum = input.nextInt();

        sum = firstNum + secondNum;
        System.out.println(firstNum+" + "+secondNum+" = "+sum);

    }
}

