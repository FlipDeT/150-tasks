package com.javastart.second;

import java.util.Scanner;

public class Main17_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input first number");
        int firstNum10 = input.nextInt();
        System.out.println("Input second number");
        int secondNum10 = input.nextInt();

        Translator19_30 first = new Translator19_30();
        Translator19_30 second = new Translator19_30();
        Sum17 sum = new Sum17();
        Multiplication18 mult = new Multiplication18();

        int firstNum2 = first.translate10to2(firstNum10);
        int secondNum2 = second.translate10to2(secondNum10);
        int sum2 = sum.sumOfNum2(firstNum2, secondNum2);
        int multiplication2 = mult.multOfNum2(firstNum2,secondNum2);

        System.out.println(firstNum2);
        System.out.println(secondNum2);
        System.out.println(sum2);
        System.out.println(multiplication2);

    }
}