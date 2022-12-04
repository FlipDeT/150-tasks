package com.javastart.first;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNum;
        int secondNum;

        System.out.println("Input first number");
        firstNum = input.nextInt();
        System.out.println("Input second number");
        secondNum = input.nextInt();

        System.out.println(firstNum+" + "+secondNum+" = "+ (firstNum+secondNum));
        System.out.println(firstNum+" - "+secondNum+" = "+ (firstNum-secondNum));
        System.out.println(firstNum+" * "+secondNum+" = "+ firstNum*secondNum);
        System.out.println(firstNum+" / "+secondNum+" = "+ firstNum/secondNum);
        System.out.println(firstNum+" % "+secondNum+" = "+ firstNum%secondNum);
    }
}
