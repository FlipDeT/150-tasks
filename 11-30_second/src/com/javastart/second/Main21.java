package com.javastart.second;

import java.util.Scanner;

public class Main21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input decimal number");
        int number10 = input.nextInt();

        Translator19_30 translate = new Translator19_30();
        System.out.println(number10+"(10) = "+translate.translate10to8(number10)+"(8)");

    }
}
