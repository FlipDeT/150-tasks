package com.javastart.seventh;

import java.util.Scanner;

public class Main111 {
    public static void main(String[] args) {
        int x, y ;
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        x = in.nextInt();
        System.out.print("Input second number: ");
        y = in.nextInt();
        int k = 0;
        while(y != 0){
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        System.out.print("Sum: "+x);
        System.out.print("\n");
    }
}
