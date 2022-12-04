package com.javastart.sixth;

public class Main104 {
    public static void main(String[] args) {
        int[] arr1 = {0, 5, 1, 2, 10, 4, -3, 0, 2};
        int check = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 10) {
                check = i;
            }
        }
        int[] arr2 = new int[check];

        for (int i = 0; i < check; i++) {
            arr2[i] = arr1[i];
            System.out.println(i + ") " + arr2[i]);
        }
    }
}
