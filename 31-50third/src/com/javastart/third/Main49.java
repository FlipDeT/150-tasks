package com.javastart.third;

import java.util.Scanner;

public class Main49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input num");
        int num = input.nextInt();
        if (num %2 == 1) {
            System.out.println(0);
        } else System.out.println(1);
    }
}
