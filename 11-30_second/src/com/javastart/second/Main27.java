package com.javastart.second;

import java.util.Scanner;

public class Main27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input octal number");

        int number8 = input.nextInt();
        Translator19_30 translate = new Translator19_30();
        System.out.println(number8+"(8) = "+translate.translate8to16(number8)+"(16)");
    }
}
