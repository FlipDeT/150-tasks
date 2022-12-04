package com.javastart.fourth;

import java.util.Scanner;

public class Main58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input string");
        String string = input.nextLine();
        char[] charString = string.toCharArray();
        StringBuilder finalString = new StringBuilder();

        int k = 0;
        int z = 0;
        for (int i = 0; i < string.length(); i++) {
            if (charString[i] == ' ') {

                while (charString[z] != ' ') {
                    finalString.append(charString[z]);
                    z++;
                }
                System.out.print(finalString.substring(0,1).toUpperCase()+finalString.substring(1)+ " ");
                finalString.delete(0,z-k);
                k = z;
                z++;
            }
        }
    }
}
