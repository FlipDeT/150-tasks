package com.javastart.sixth;

public class Main102 {
    public static void main(String[] args) {
        int [] arr1 = {0, 5, 10, 84, -8, 4, -3, 7, 55};
        boolean check = false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 10 || arr1[i] == 30) {
                check = true;
                break;
            }
        }

        System.out.println(check);
    }
}
