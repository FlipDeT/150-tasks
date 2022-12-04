package com.javastart.third;

import java.util.Scanner;

public class Main38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input message");
        String message = input.nextLine();

        int letters = 0;
        int numbers = 0;
        int intervals = 0;
        int others = 0;
        char[] symbol = message.toCharArray();

        for (int i = 0; i < message.length(); i++) {
            if (Character.isLetter(symbol[i])) {
                letters++;
            } else if (Character.isDigit(symbol[i])) {
                numbers++;
            } else if (Character.isSpaceChar(symbol[i])) {
                intervals = intervals + 1;
            } else others++;
        }

        System.out.println("letters: "+letters);
        System.out.println("numbers: "+numbers);
        System.out.println("intervals: "+intervals);
        System.out.println("Others: "+others);
    }
}
