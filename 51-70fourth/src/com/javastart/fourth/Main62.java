package com.javastart.fourth;

import java.util.Scanner;

public class Main62 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1 = ");
        int first = input.nextInt();
        System.out.print("2 = ");
        int second = input.nextInt();
        System.out.print("3 = ");
        int third = input.nextInt();

        System.out.println(Math.abs(first-second) >= 20 || Math.abs(first-third) >=20 || Math.abs(second-third) >=20);
    }
}
