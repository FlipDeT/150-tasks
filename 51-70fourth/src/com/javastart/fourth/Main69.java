package com.javastart.fourth;

import java.util.Scanner;

public class Main69 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input even word");
        String word = input.next();

        for (int i = 0; i < word.length()/2; i++) {
            System.out.print(word.charAt(i));
        }
    }
}
