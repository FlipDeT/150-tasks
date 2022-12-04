package com.javastart.eighth;

public class Main132 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7};
        int k = 2;
        for (int i = 2; i < arr.length; i ++) {
            if (arr[i] != arr[i - 1] || arr[i] != arr[i-2]) {
                k++;
            }
        }
        System.out.println(k);
    }
}
