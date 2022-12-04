package com.javastart.seventh;

import java.util.Scanner;

public class Main124 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input number");
        int[] arr = {1, 2, 4, 7, 11, 12};
        int number = input.nextInt();
        int index = -1;

        if (number<arr[1]) {
            index = 0;
        }

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == number) {
                index = i;
                break;
            } else if (number > arr[i] && number < arr[i+1]) {
                index = i+1;
                break;
            }
        }

        if (number > arr[arr.length-1]) {
            index = arr.length;
        }

        System.out.println("index of number "+number+" is "+index);
    }
}
