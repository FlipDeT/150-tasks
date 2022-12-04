package com.javastart.eighth;

public class Main131 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7};
        int k = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                k++;
            }
        }
        System.out.println(k);

    }
}
