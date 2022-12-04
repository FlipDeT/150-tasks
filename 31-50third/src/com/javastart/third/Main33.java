package com.javastart.third;

import java.util.Scanner;

public class Main33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input number");
        int number = input.nextInt();
        int sum = number%10;
        System.out.print(sum);
        number = number / 10;

        while (number > 0) {
            System.out.print(" + "+number%10);
            sum = sum + number % 10;
            number = number /10;
        }
        System.out.print(" = "+sum);
    }
}
