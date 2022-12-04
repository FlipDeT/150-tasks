package com.javastart.sixth;

public class Main92 {
    public static void main(String[] args) {
        int [] arr = {1, 5, 5, 4, 6, 0};
        int even = 0;
        int unEven = 0;
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            }else unEven++;
        }
        System.out.println("even = "+even+" uneven = "+unEven);
    }
}
