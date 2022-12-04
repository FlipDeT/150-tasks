package com.javastart.third;

import java.util.Scanner;

public class Main42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String pass = "lol123";
        boolean error = true;
        while (error) {
            System.out.print("Input password: ");
            String enterPass = input.nextLine();
            if (pass.equals(enterPass)) {
                System.out.println("correct, your password is "+pass);
                error = false;
            } else {
                System.out.println("error");
            }
        }
    }
}
