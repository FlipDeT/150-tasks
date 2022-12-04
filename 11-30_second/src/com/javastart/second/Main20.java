package com.javastart.second;

import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Translator19_30 translate = new Translator19_30();

        System.out.println("Input decimal number");
        int number10 = input.nextInt();

        String number16 = translate.translate10to16(number10);
        System.out.println(number10+"(10) = "+number16+"(16)");

    }
}
