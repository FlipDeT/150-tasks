package com.javastart.third;

import java.util.Scanner;

public class Main44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input number");
        int num = input.nextInt();

        System.out.println(num+" + "+(num+ 10*num)+" + "+ (num + 10*num + 100*num)+" = "+(3*num + 20*num + 100*num));
    }
}
