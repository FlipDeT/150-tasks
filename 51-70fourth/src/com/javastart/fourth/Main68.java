package com.javastart.fourth;

import java.util.Scanner;

public class Main68 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input string");
        String string = input.nextLine();
        String newString = "";

        for (int i = string.length() - 3; i < string.length() ; i++) {
            newString += (string.charAt(i));
        }
        System.out.println(newString + newString + newString + newString);
    }
}
