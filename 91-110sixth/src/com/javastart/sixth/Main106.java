package com.javastart.sixth;

public class Main106 {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = new int[arr1.length];
        arr2[arr1.length-1] = arr1[0];

        for (int i = 0; i < arr1.length - 1; i++) {
            arr2[i] = arr1[i+1];
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]+"  "+arr2[i]);
        }
    }
}
