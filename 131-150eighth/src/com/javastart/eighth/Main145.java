package com.javastart.eighth;

import java.util.ArrayList;
import java.util.Scanner;

public class Main145 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number");
        int number = input.nextInt();

        int [] arr = {1, 5, 99, 8, 45, 67, 5, 4, 2};

        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length-number) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
