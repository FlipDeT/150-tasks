package com.javastart.third;

public class Main50 {
    public static void main(String[] args) {
        System.out.println("%3");
        for (int i = 1; i<=100; i++){
            if (i%3 == 0) System.out.print(i+", ");
        }
        System.out.println("\n\n%5");
        for (int i = 1; i<=100; i++){
            if (i%5 == 0) System.out.print(i+", ");
        }
        System.out.println("\n\n%3 and %5");
        for (int i = 1; i<=100; i++){
            if ((i%3 == 0)||(i%5 == 0)) System.out.print(i+", ");
        }
    }
}
