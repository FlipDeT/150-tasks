package com.javastart.third;

import java.util.Scanner;

public class Main37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input string");
        String string = input.next();
        String newString = "";
        int i = 0;
        while (i < string.length()) {
            newString = newString + string.charAt(string.length() - 1 - i);
            i = i + 1;
        }
        System.out.println(newString);
    }
}
