package com.javastart.fourth;

import java.util.Scanner;

public class Main57 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input number");
        int number = input.nextInt();
        int k = 0;

        for (int i = 1; i <= (int)Math.sqrt(number); i++){
            if (number%i == 0 && i*i != number) {
                k = k+2;
            } else if (i*i == number) k++;
        }

        System.out.println(k);
    }
}
