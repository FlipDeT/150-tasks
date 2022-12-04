package com.javastart.third;

import java.util.Scanner;

public class Main35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter quantity of angles");
        int n = input.nextInt();

        System.out.println("enter side length");
        int side = input.nextInt();

        System.out.println("Square of "+n+"-angles = "+(side*side*n / 4.0 / Math.tan(Math.PI/n)));

    }
}
