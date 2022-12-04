package com.javastart.seventh;

import java.util.Scanner;

public class Main118 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input string");
        String string = input.nextLine();
        System.out.println("input searching symbol");
        String search = input.next();
        char[] searchChar = search.toCharArray();
        char[] stringChar = string.toCharArray();
        int index = 0;

        for (int i = 1; i < string.length(); i++) {
            if (stringChar[i - 1] == searchChar[0] && stringChar[i] == searchChar[1]) {
                index = i;
                break;
            }
        }

        if (index > 0) {
            System.out.println(index);
        } else System.out.println("not found");
    }
}
