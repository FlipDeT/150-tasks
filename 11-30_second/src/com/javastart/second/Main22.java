package com.javastart.second;

import java.util.Scanner;

public class Main22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input binary number");

        int number2 = input.nextInt();
        Translator19_30 translate = new Translator19_30();

        System.out.println(number2+"(2) = "+translate.translate2to10(number2)+"(10)");
    }
}
