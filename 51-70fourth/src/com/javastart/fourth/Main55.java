package com.javastart.fourth;

import java.util.Scanner;

public class Main55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input time in seconds: ");
        int second = input.nextInt();

        System.out.println(second/3600+":"+(second%3600/60)+":"+(second%3600%60));
    }
}
