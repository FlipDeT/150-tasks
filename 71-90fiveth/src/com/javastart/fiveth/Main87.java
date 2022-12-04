package com.javastart.fiveth;

import java.util.Scanner;

public class Main87 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input number");
        int number = input.nextInt();
        int sum = 0;

        while (number > 0) {
            sum += number%10;
            switch (number%10) {
                case 0:
                    System.out.print("zero ");
                    break;
                case 1:
                    System.out.print("one ");
                    break;
                case 2:
                    System.out.print("tho ");
                    break;
                case 3:
                    System.out.print("three ");
                    break;
                case 4:
                    System.out.print("four ");
                    break;
                case 5:
                    System.out.print("five ");
                    break;
                case 6:
                    System.out.print("six ");
                    break;
                case 7:
                    System.out.print("seven ");
                    break;
                case 8:
                    System.out.print("eight ");
                    break;
                case 9:
                    System.out.print("nine ");
                    break;
            }
            if (number / 10 == 0) {
                    System.out.print("= ");
                } else System.out.print("+ ");
            number = number/10;
        }
        System.out.println(sum);
    }
}
