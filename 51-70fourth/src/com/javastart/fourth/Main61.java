package com.javastart.fourth;

import java.util.Scanner;

public class Main61 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input string");
        String string = input.nextLine();
        char[] charString = string.toCharArray();

        for (int i = 0; i < string.length(); i++) {
            System.out.print(charString[string.length()-i-1]);
        }
    }
}
