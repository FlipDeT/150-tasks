package com.javastart.first;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNum;
        int secondNum;

        System.out.println("Input first Number");
        firstNum = input.nextInt();
        System.out.println("Input second Number");
        secondNum = input.nextInt();

        System.out.println(firstNum+" / "+secondNum+" = "+ firstNum/secondNum);
    }
}
