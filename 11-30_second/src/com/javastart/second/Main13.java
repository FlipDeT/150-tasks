package com.javastart.second;

import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input length: ");
        int length = input.nextInt();
        System.out.println("Input height: ");
        int height = input.nextInt();

        System.out.println("perimeter = "+ 2*(length+height));
        System.out.println("area = "+ length*height);
    }
}
