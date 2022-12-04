package com.javastart.second;

import java.util.Scanner;

public class Main24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input binary number");

        int number2 = input.nextInt();
        Translator19_30 translate = new Translator19_30();
        System.out.println(number2 +"(2) = "+translate.trans2to8(number2)+ "(8)");
    }
}
