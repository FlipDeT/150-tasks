package com.javastart.eighth;

import java.util.Scanner;

public class Main134 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input number");
        int number = input.nextInt();

        if (number <= 1) {
            System.out.println(1);
        }
        int[] s_case = new int[number + 1];
        s_case[0] = 1;
        s_case[1] = 1;
        for (int i = 2; i <= number; i++) {
            s_case[i] = s_case[i - 1] + s_case[i - 2];
        }
        System.out.println(s_case[number]);
    }
}
