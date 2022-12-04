package com.javastart.seventh;

import java.util.Scanner;

public class Main115 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input number");
        int number = input.nextInt();
        int length = 0;
        int memory = number;
        int check = 0;

        while (number > 0){
            length++;
            number /=10;
        }

        int [] arrNumber = new int[length];

        for (int i = 0; i < length; i++) {
            arrNumber[i] = memory%10;
            memory /= 10;
        }

        for (int i = 0; i < length/2; i++) {
            if (arrNumber[i] == arrNumber[length-i-1]) {
                check++;
            }
        }
        if (check == length/2) {
            System.out.println("This is palindrom");
        } else System.out.println("This is not palindrom");
    }
}
