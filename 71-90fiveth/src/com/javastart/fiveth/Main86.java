package com.javastart.fiveth;

public class Main86 {
    public static void main(String[] args) {
        int n = 15;
        int k = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n/2;
            } else {
                n *= 3;
                n++;
            }
            System.out.println(k+") "+n);
            k++;
        }
        System.out.println("thats all");
    }
}
