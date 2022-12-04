package com.javastart.sixth;

public class Main100 {
    public static void main(String[] args) {
        int [] arr1 = {0, 5, 6, 84, -8, 4, -3, 7, 55};
        int [] arr2 = {8, 3, 8, 9, -9, 2, 3, 83, 55};
        int kind = 0;
        int z = 0;
        while (z < arr1.length){
            for (int i = 0; i < arr1.length; i++) {
                if (Math.abs(arr1[z] - arr2[i]) <= 1) {
                    kind++;
                }
            }
            z++;
        }
        System.out.println(kind);
    }
}
