package com.javastart.sixth;

public class Main96 {
    public static void main(String[] args) {
        int [] arr = {0, 0, 20, 10, 50, 0};
        int tenIndex = arr.length;
        int twentyIndex = 0;

        for (int i = 0; i< arr.length; i++) {
            if (arr[i] == 10) {
                tenIndex = i;
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 20) {
                twentyIndex = i;
            }
        }

        if (tenIndex < twentyIndex) {
            System.out.println(true);
        } else System.out.println(false);
    }
}
