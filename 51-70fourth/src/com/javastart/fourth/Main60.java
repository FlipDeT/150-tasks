package com.javastart.fourth;

import java.util.Scanner;

public class Main60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input string");
        String string = input.nextLine();

        String [] words = string.split(" ");
        System.out.println(words[words.length - 2]);
    }
}
