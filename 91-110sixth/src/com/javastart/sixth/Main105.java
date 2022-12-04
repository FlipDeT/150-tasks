package com.javastart.sixth;

public class Main105 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2, 10, 4, -3, 0, 2};
        boolean check = false;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[0] == arr[arr.length - 2]) && (arr[1] == arr[arr.length - 1])) {
                check = true;
            }
        }
        System.out.println(check);
    }
}
