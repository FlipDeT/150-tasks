package com.javastart.seventh;

import java.util.Scanner;

public class Main119 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = {5, 3, 0, -4, 11, 3, 700, -46};
        System.out.println("input searching number");
        int number = input.nextInt();
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index = i;
                break;
            }
        }

        if (index >= 0) {
            System.out.println("index of number "+number+" is "+index);
        } else System.out.println("not found");
    }
}
