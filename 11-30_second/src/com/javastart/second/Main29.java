package com.javastart.second;

import java.util.Scanner;

public class Main29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input hexadecimal number");

        String number16 = input.next();
        Translator19_30 translate = new Translator19_30();
        System.out.println(number16 + "(16) = " + translate.translate16to2(number16) + "(2)");
    }
}
