package com.javastart.sixth;

public class Main101 {
    public static void main(String[] args) {
        int [] arr = {10, 20, 6, 84, 20, 4, -3, 7, 55};
        int tenKind = 0;
        int twentyKind = 0;

        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == 10) {
                tenKind++;
            }
            if (arr[i] == 20) {
                twentyKind++;
            }
        }

        if (tenKind > twentyKind) {
            System.out.println(true);
        } else System.out.println(false);
    }
}