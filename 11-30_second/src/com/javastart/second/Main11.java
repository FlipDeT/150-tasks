package com.javastart.second;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input radius");
        double radius = input.nextDouble();

        System.out.println("Perimeter = "+ (2*Math.PI*radius));
        System.out.println("Area = "+ (Math.PI*radius*radius));

    }
}
