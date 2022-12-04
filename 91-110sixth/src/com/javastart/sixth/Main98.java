package com.javastart.sixth;

public class Main98 {
    public static void main(String[] args) {
        int[] arr = {5, 0, 6, 20, 9, 20, 20, 0, 0, 2, 5, 4, 6, 1};
        int counter = 0;
        boolean check = true;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == 20) {
                counter++;
            }
            if (arr[i] == 20 && arr[i+1] == 20) {
                check = false;
            }
        }

        if (counter == 3 && check) {
            System.out.println(true);
        } else System.out.println(false);
    }
}
