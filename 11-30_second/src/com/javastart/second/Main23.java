package com.javastart.second;

import java.util.Scanner;

public class Main23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input binary number");

        int number2 = input.nextInt();
        Translator19_30 translate = new Translator19_30();

        System.out.println(number2 + "(2) = "+translate.translate2to16(number2)+"(16)");
}
}
