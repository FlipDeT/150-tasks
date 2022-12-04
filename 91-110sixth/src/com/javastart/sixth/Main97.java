package com.javastart.sixth;

import java.util.Scanner;

public class Main97 {
    public static void main(String[] args) {
        int[] arr = {5, 0, 6, 5, 9, 50, 7, 3, 0, 2, 5, 4, 6, 1};
        Scanner input = new Scanner(System.in);
        System.out.println("input number");
        int number = input.nextInt();
        boolean check = false;

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == number && (arr[i] == arr[i + 1] || arr[i] == arr[i + 2])) {
                check = true;
                break;
            }
        }

        System.out.println(check);
    }
}
