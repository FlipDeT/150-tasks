package com.javastart.fourth;

import java.util.Scanner;

public class Main70 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input first word");
        String firstWord = input.next();
        System.out.println("input second word");
        String secondWord = input.next();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(firstWord).append(secondWord).append(firstWord);
        System.out.println(stringBuilder);
    }
}
