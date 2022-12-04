package com.javastart.sixth;

public class Main107 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 10, 4, -3, 0, 2};
        boolean check = false;

        for (int i = 3; i < arr.length; i++) {
            if ((arr[i-1] == arr[i] -1) && (arr[i-2] == arr[i] -2) && (arr[i-3] == arr[i] -3)) {
                check = true;
            }
        }

        System.out.println(check);
    }
}
